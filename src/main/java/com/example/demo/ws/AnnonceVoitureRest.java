package com.example.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.AnnonceVoiture;
import com.example.demo.service.AnnonceVoitureService;

@RestController
@RequestMapping("stock-api/voiture")
public class AnnonceVoitureRest {

    public List<AnnonceVoiture> findBymontant(double montant){
        return voitureService.findBymontant(montant);
    }
    @Autowired
    private AnnonceVoitureService voitureService;


    @GetMapping("/ref/{ref}")
    public AnnonceVoiture findByref(@PathVariable String ref) {
        return voitureService.findByref(ref);
    }

    public AnnonceVoiture findByrefUser(String refUser) {
        return voitureService.findByrefUser(refUser);
    }

    public List<AnnonceVoiture> findByUtilisateurRefe(String refe) {
        return voitureService.findByUtilisateurRefe(refe);
    }

    @GetMapping("/")
    public List<AnnonceVoiture> findAll() {
        return voitureService.findAll();
    }

    @PostMapping("/")
    public int save(AnnonceVoiture voiture) {
        return voitureService.save(voiture);
    }

}
