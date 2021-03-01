package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.fac.miniavito.bean.Matiere;

@Repository
public interface MatiereDao extends JpaRepository<Matiere, Long> {
	public Matiere findByRef(String ref);
	public int deleteByRef(String ref);
}
