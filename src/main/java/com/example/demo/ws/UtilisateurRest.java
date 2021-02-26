package com.example.demo.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Utilisateur;
import com.example.demo.service.UtilisateurService;

@RestController
@RequestMapping("stock-api/utilisateur")
public class UtilisateurRest {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/refe/{refe}")
    public Utilisateur findByRefe(String refe) {
        return utilisateurService.findByRefe(refe);
    }

    @PostMapping("/")
    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    @GetMapping("/")
    public List<Utilisateur> findAll() {
        return utilisateurService.findAll();
    }


}
