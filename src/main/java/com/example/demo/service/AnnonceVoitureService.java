package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.AnnonceVoiture;
import com.example.demo.dao.AnnonceVoitureDao;

@Service
public class AnnonceVoitureService {

    @Autowired
    private UtilisateurService utilisateurService;
    
    @Autowired
    private AnnonceVoitureDao voitureDao;


    
    public AnnonceVoiture findByref(String ref) {
        return voitureDao.findByref(ref);
    }

    public AnnonceVoiture findByrefUser(String refUser) {
        return voitureDao.findByrefUser(refUser);
    }

    public List<AnnonceVoiture> findByUtilisateurRefe(String refe) {
        return voitureDao.findByUtilisateurRefe(refe);
    }

    public List<AnnonceVoiture> findBymontant(double montant) {
        return voitureDao.findBymontant(montant);
    }

    public int save(AnnonceVoiture voiture) {
        if(findByref(voiture.getRef())==null) {
            return -1;
        }else if(findByrefUser(voiture.getRefUser())==null) {
            return -2;
        }else {
            voitureDao.save(voiture);
            return 1;
        }
    }

    public List<AnnonceVoiture> findAll() {
        return voitureDao.findAll();
    }


}

