package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Commentaire;
import com.example.demo.services.CommentaireService;

@RestController
@RequestMapping
@CrossOrigin(origins ="*")
public class CommentaireController {

	@Autowired
    public CommentaireService comService;


    @GetMapping("/getCommentaires")
    public List<Commentaire> getCommentaires(){
        return comService.getCommentaires();
    }


    @GetMapping("/getCommentaireByID/{id}")
    public Commentaire getCommentaireById(@PathVariable int id){
        return comService.getCommentaireById(id);
    }

    @GetMapping("/getCommentaireByIdUser/{id}")
    public Commentaire getCommentaireByIdUser(@PathVariable int id){
        return comService.getCommentaireByIdUser(id);
    }
    
    @GetMapping("/getCommentaireByIdArticle/{id}")
    public Commentaire getCommentaireByIdArticle(@PathVariable int id){
        return comService.getCommentaireByIdArticle(id);
    }
    
    @PostMapping("/saveCommentaire")
    public Commentaire saveCommentaire(Commentaire com){
        return comService.addCommentaire(com);
    }

    @PutMapping("/updateCommentaire")
    public Commentaire updateCommentaire(Commentaire com){
        return comService.update(com);
    }

    @DeleteMapping("/deleteCommentaire/{id}")
    public String deleteCommentaire(@PathVariable int  id){
        return comService.deleteCommentaireById(id);
    }
    
    @DeleteMapping("/deleteAllCommentaires")
    public String deleteAll(){
        return comService.deleteAllCommentaires();
    }
	
}
