package com.emploi.app;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.emploi.app.entities.Salle;

@Repository
public class SalleDao extends GenericDAOImpl<Salle> {

	@Override
	public void addOrUpdate(Salle t) throws Exception {
		// TODO Auto-generated method stub
		super.addOrUpdate(t);
	}

	@Override
	public void delete(Salle t) throws Exception {
		// TODO Auto-generated method stub
		super.delete(t);
	}

	@Override
	public Salle getByIndex(Serializable id) throws Exception {
		// TODO Auto-generated method stub
		return super.getByIndex(id);
	}

	@Override
	public List<Salle> getAll() throws Exception {
		// TODO Auto-generated method stub
		return super.getAll();
	}

}
