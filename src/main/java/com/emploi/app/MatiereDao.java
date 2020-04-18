package com.emploi.app;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.emploi.app.entities.Matiere;

@Repository
public class MatiereDao extends GenericDAOImpl<Matiere>{

	@Override
	public void addOrUpdate(Matiere t) throws Exception {
		// TODO Auto-generated method stub
		super.addOrUpdate(t);
	}

	@Override
	public void delete(Matiere t) throws Exception {
		// TODO Auto-generated method stub
		super.delete(t);
	}

	@Override
	public Matiere getByIndex(Serializable id) throws Exception {
		// TODO Auto-generated method stub
		return super.getByIndex(id);
	}

	@Override
	public List<Matiere> getAll() throws Exception {
		// TODO Auto-generated method stub
		return super.getAll();
	}

}
