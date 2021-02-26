package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Utilisateur;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
    public Utilisateur findByRefe(String refe);
    List<Utilisateur>findByProf(boolean prof);
}