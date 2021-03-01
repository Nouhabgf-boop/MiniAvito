package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.Matiere;
import com.example.demo.dao.MatiereDao;

@Service
public class MatiereService {
	
	@Autowired
	private MatiereDao matiereDao;
	
	@Autowired
	private AnnonceHSService annonceHSService;

	public Matiere findByRef(String ref) {
		return matiereDao.findByRef(ref);
	}
	
	public void update(Matiere matiere) {
		matiereDao.save(matiere);
	}
	

	@Transactional
	public int deleteByRef(String ref) {
		int resultAnnonceHS = annonceHSService.deleteByMatiereRef(ref);
		int resultMatiere = matiereDao.deleteByRef(ref);
		return resultAnnonceHS+resultMatiere ;
	}

	public int save(Matiere matiere) {
		Matiere mat = findByRef(matiere.getRef());
		if(mat != null) {
			return -1;
		} else {
			matiereDao.save(matiere);
			return 1;
		}
	}

	public List<Matiere> findAll() {
		return matiereDao.findAll();
	}
	
}
