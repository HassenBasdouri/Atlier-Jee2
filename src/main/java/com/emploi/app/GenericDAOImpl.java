package com.emploi.app;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericDAOImpl<T> implements GenricDao <T> {
	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	private Class<T> type=(Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	@Override
	public void addOrUpdate(T t) throws Exception{
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		try {
			session.saveOrUpdate(t);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
		session.close();
	}
	@Override
	public void delete(T t) throws Exception{
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(session.contains(t) ? t : session.merge(t));
		session.getTransaction().commit();
		session.close();
	}
	public T getByIndex(Serializable id) throws Exception{
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();;
		Object o=session.get(type,id);
		if(o==null) throw new RuntimeException(type.getName()+"with "+id+" deos not Exit !");
		session.getTransaction().commit();
		session.close();
		return (T)o;
	}
	@Override
	public List<T> getAll() throws Exception {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<T> data=session.createQuery("from "+ type.getName()).list();
		session.getTransaction().commit();
		session.close();
		return data ;
	}

}
