package com.emploi.app;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.emploi.app.entities.Enseignant;

@Repository
public class EnseignantDao extends GenericDAOImpl<Enseignant> {

	@Override
	public void addOrUpdate(Enseignant t) throws Exception {
		// TODO Auto-generated method stub
		super.addOrUpdate(t);
	}

	@Override
	public void delete(Enseignant t) throws Exception {
		// TODO Auto-generated method stub
		super.delete(t);
	}

	@Override
	public Enseignant getByIndex(Serializable id) throws Exception {
		// TODO Auto-generated method stub
		return super.getByIndex(id);
	}

	@Override
	public List<Enseignant> getAll() throws Exception {
		// TODO Auto-generated method stub
		return super.getAll();
	}

}
