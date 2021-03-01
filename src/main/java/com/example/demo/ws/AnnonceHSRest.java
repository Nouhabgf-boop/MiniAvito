package com.example.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.AnnonceHS;
import com.example.demo.service.AnnonceHSService;

@RestController
@RequestMapping("/avito/annoncehs")
public class AnnonceHSRest {
	@Autowired
	private AnnonceHSService annonceHSService;

	@GetMapping("/ref/{ref}")
	public AnnonceHS findByRef(@PathVariable String ref) {
		return annonceHSService.findByRef(ref);
	}

	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return annonceHSService.deleteByRef(ref);
	}

	@PostMapping("/")
	public int save(@RequestBody AnnonceHS annonceHS) {
		return annonceHSService.save(annonceHS);
	}
	
	 
	@GetMapping("matiere/refmat/{refmat}")
	public List<AnnonceHS> findByMatiereRef(@PathVariable String refmat) {
		return annonceHSService.findByMatiereRef(refmat);
	}

	
	@DeleteMapping("matiere/refmat/{refmat}")
	public int deleteByMatiereRef(@PathVariable String refmat) {
		return annonceHSService.deleteByMatiereRef(refmat);
	}
	

	@GetMapping("/")
	public List<AnnonceHS> findAll() {
		return annonceHSService.findAll();
	}
	
}
