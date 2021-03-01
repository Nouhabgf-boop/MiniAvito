package com.example.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Matiere;
import com.example.demo.service.MatiereService;

@RestController
@RequestMapping("avito/matiere")
public class MatiereRest {

	@Autowired
	MatiereService matiereService;
	
	@GetMapping("/")
	public List<Matiere> findAll() {
		return matiereService.findAll();
	}
	
	@PostMapping("/")
	public int save(@RequestBody Matiere matiere) {
		return matiereService.save(matiere);
	}

	@GetMapping("/ref/{ref}")
	public Matiere findByRef(@PathVariable String ref) {
		return matiereService.findByRef(ref);
	}
	
	@PutMapping("/")
	public void update(@RequestBody Matiere matiere) {
		matiereService.update(matiere);
	}

	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return matiereService.deleteByRef(ref);
	}

	


	
	
}
