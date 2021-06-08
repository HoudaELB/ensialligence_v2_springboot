package com.example.demo.controllers;

import com.example.demo.models.Utilisateur;
import com.example.demo.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins ="*")
public class UtilisateurController {

    @Autowired
    public UtilisateurService utilisateurService;


    @GetMapping("/getUtilisateurs")
    public List<Utilisateur> getArticles(){

        return utilisateurService.getUtilisateurs();
    }


    @GetMapping("/getUtilisateurByID/{id}")
    public Utilisateur getArticleById(@PathVariable int id){
        return utilisateurService.getUtilisateurById(id);
    }

    @GetMapping("/getUtilisateurByFname/{titre}")
    public Utilisateur getUtilisateurByFname(@PathVariable String fname){
        return utilisateurService.getUtilisateurByfname(fname);
    }
    @GetMapping("/getUtilisateurBylname/{Categorie}")
    public Utilisateur getArticleByCategorie(@PathVariable String lname){
        return utilisateurService.getUtilisateurBylname(lname);
    }

    @PostMapping("/saveUtilisateur")
    public Utilisateur saveUtilisateur(Utilisateur utilisateur){
        return utilisateurService.createUtilisateur(utilisateur);
    }

    @PutMapping("/updateUtilisateur")
    public Utilisateur updateUtilisateur(int id,Utilisateur utilisateur){
        return utilisateurService.update(id,utilisateur);
    }

    @DeleteMapping("/deleteAllUtilisateur")
    public String deleteAll(){
        return utilisateurService.deleteAllUtilisateur();
    }
    @DeleteMapping("/deleteUtilisateur/{id}")
    public String deleteArticle(@PathVariable int  id){
        return utilisateurService.deleteUtilisateurById(id);
    }
}
