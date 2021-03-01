package com.example.demo.dao;


import ma.fac.miniavito.bean.AnnonceHS;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnonceHSDao extends JpaRepository<AnnonceHS,Long> {
	
	AnnonceHS findByRef(String ref);
	
	List<AnnonceHS> findByMatiereRef(String ref);
	
    int deleteByMatiereRef(String ref);
    
    int deleteByRef(String ref);

     
}

