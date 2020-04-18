package com.emploi.app;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.emploi.app.entities.Seance;

@Repository
public class SeanceDao extends GenericDAOImpl<Seance>{

	@Override
	public void addOrUpdate(Seance t) throws Exception {
		// TODO Auto-generated method stub
		super.addOrUpdate(t);
	}

	@Override
	public void delete(Seance t) throws Exception {
		// TODO Auto-generated method stub
		super.delete(t);
	}

	@Override
	public Seance getByIndex(Serializable id) throws Exception {
		// TODO Auto-generated method stub
		return super.getByIndex(id);
	}

	@Override
	public List<Seance> getAll() throws Exception {
		// TODO Auto-generated method stub
		return super.getAll();
	}

}
