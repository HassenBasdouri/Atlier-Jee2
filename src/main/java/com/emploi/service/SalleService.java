package com.emploi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emploi.app.SalleDao;
import com.emploi.app.entities.Salle;


@Service("salleService")
public class SalleService {
	@Autowired
	SalleDao salleDao;
 
	@Transactional
	public List<Salle> getAll() throws Exception {
		return salleDao.getAll();
	}
 
	@Transactional
	public Salle getSalle(Long id) throws Exception {
		return salleDao.getByIndex(id);
	}
 
	@Transactional
	public void addOrUpdate(Salle salle) throws Exception {
		salleDao.addOrUpdate(salle);
	}
 
 
	@Transactional
	public void delete(Salle salle) throws Exception {
		salleDao.delete(salle);
	}

}
