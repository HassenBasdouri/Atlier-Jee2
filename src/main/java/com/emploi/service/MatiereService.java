package com.emploi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emploi.app.MatiereDao;
import com.emploi.app.entities.Matiere;


@Service("matiereService")
public class MatiereService {
	@Autowired
	MatiereDao matiereDao;
 
	@Transactional
	public List<Matiere> getAll() throws Exception {
		return matiereDao.getAll();
	}
 
	@Transactional
	public Matiere getMatiere(Long id) throws Exception {
		return matiereDao.getByIndex(id);
	}
 
	@Transactional
	public void addOrUpdate(Matiere matiere) throws Exception {
		matiereDao.addOrUpdate(matiere);
	}
 
 
	@Transactional
	public void delete(Matiere matiere) throws Exception {
		matiereDao.delete(matiere);
	}

}
