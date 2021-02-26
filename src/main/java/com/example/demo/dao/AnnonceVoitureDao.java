package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.AnnonceVoiture;

@Repository
public interface AnnonceVoitureDao extends JpaRepository<AnnonceVoiture, Long> {

    public AnnonceVoiture findByref(String ref);
    public AnnonceVoiture findByrefUser(String refUser);
    public List<AnnonceVoiture> findByUtilisateurRefe(String refe);
    List<AnnonceVoiture> findBymontant(double montant);
}

