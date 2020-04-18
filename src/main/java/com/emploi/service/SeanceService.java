package com.emploi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emploi.app.SeanceDao;
import com.emploi.app.entities.Seance;


@Service("seanceService")
public class SeanceService {
	@Autowired
	SeanceDao seanceDao;
 
	@Transactional
	public List<Seance> getAll() throws Exception {
		return seanceDao.getAll();
	}
 
	@Transactional
	public Seance getSeance(Long id) throws Exception {
		return seanceDao.getByIndex(id);
	}
 
	@Transactional
	public void addOrUpdate(Seance seance) throws Exception {
		seanceDao.addOrUpdate(seance);
	}
 
 
	@Transactional
	public void delete(Seance seance) throws Exception {
		seanceDao.delete(seance);
	}

}
