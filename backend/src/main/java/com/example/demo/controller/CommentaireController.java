package com.example.demo.controller;

import com.example.demo.model.Commentaire;
import com.example.demo.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class CommentaireController {
    @Autowired
    public CommentaireService commentaireService;


    @GetMapping("/getCommentaires")
    public List<Commentaire> getCommentaires(){
        return commentaireService.getCommentaires();
    }


    @GetMapping("/getCommentaireByID/{id}")
    public Commentaire getCommentaireById(@PathVariable int id){
        return commentaireService.getCommentaireById(id);
    }

    @GetMapping("/getCommentaireByIdUser/{id}")
    public Commentaire getCommentaireByIdUser(@PathVariable int id){
        return commentaireService.getCommentaireByIdUser(id);
    }

    @GetMapping("/getCommentaireByIdArticle/{id}")
    public Commentaire getCommentaireByIdArticle(@PathVariable int id){
        return commentaireService.getCommentaireByIdArticle(id);
    }

    @PostMapping("/saveCommentaire")
    public Commentaire saveCommentaire(Commentaire com){
        return commentaireService.addCommentaire(com);
    }

    @PutMapping("/updateCommentaire")
    public Commentaire updateCommentaire(Commentaire com){
        return commentaireService.update(com);
    }

    @DeleteMapping("/deleteCommentaire/{id}")
    public String deleteCommentaire(@PathVariable int  id){
        return commentaireService.deleteCommentaireById(id);
    }

    @DeleteMapping("/deleteAllCommentaires")
    public String deleteAll(){
        return commentaireService.deleteAllCommentaires();
    }

}
