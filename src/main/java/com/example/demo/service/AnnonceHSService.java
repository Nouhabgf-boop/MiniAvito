package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.AnnonceHS;
import com.example.demo.bean.Matiere;
import com.example.demo.AnnonceHSDao;

@Service
public class AnnonceHSService {
	
	@Autowired
	private AnnonceHSDao annonceHSDao;
	private MatiereService matiereService;

	public AnnonceHS findByRef(String ref) {
		return annonceHSDao.findByRef(ref);
	}
	
	
	
	public int save(AnnonceHS annonceHS) {
		
		if(findByRef(annonceHS.getRef()) != null) {
			return -1;
		}
		
		Matiere matiere = matiereService.findByRef(annonceHS.getMatiere().getRef());
		annonceHS.setMatiere(matiere);
		
		if(matiere == null){ 
			return -2;
		}
		else {
			matiereService.update(matiere);
			annonceHSDao.save(annonceHS);
			return 1;
		}
	}

	@Transactional
	public int deleteByRef(String ref) {
		return annonceHSDao.deleteByRef(ref);
	}

	

	public List<AnnonceHS> findAll() {
		return annonceHSDao.findAll();
	}
	
	public List<AnnonceHS> findByMatiereRef(String refMatiere) {
		return annonceHSDao.findByMatiereRef(refMatiere);
	}


	@Transactional
	public int deleteByMatiereRef(String ref) {
		return annonceHSDao.deleteByMatiereRef(ref);
	}
	
	
	
	
}
