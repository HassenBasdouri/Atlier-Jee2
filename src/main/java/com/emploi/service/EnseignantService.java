package com.emploi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emploi.app.EnseignantDao;
import com.emploi.app.entities.Enseignant;

@Service("enseignantService")
public class EnseignantService {
	@Autowired
	EnseignantDao enseignantDao;
 
	@Transactional
	public List<Enseignant> getAll() throws Exception {
		return enseignantDao.getAll();
	}
 
	@Transactional
	public Enseignant getEnseignant(Long id) throws Exception {
		return enseignantDao.getByIndex(id);
	}
 
	@Transactional
	public void addOrUpdate(Enseignant enseignant) throws Exception {
		enseignantDao.addOrUpdate(enseignant);
	}
 
 
	@Transactional
	public void delete(Enseignant enseignant) throws Exception {
		enseignantDao.delete(enseignant);
	}

}
