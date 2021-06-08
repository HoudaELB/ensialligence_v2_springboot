package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAOs.CommentaireDAO;
import com.example.demo.models.Commentaire;

@Service
public class CommentaireService {

	@Autowired
    CommentaireDAO comDAO;

    public Commentaire addCommentaire(Commentaire com){
        return comDAO.save(com);
    }

    public List<Commentaire> getCommentaires(){
        return comDAO.findAll();
    }

    public Commentaire getCommentaireById(int id){
        return comDAO.findCommentaireByIdCom(id);
    }

    public Commentaire getfindCommentaireByIdUser(int idUser){
        return comDAO.findCommentaireByIdUser(idUser);
    }

    public Commentaire getCommentaireByIdArticle(int idArticle){
        return comDAO.findCommentaireByIdArticle(idArticle);
    }
    
    public Commentaire update(Commentaire com){
         return comDAO.save(com);
    }

    public String deleteArticleById(int id){
    	comDAO.deleteById(id);
        return "Commentaire "+id+" is deleted successfully";
    }
    
    public String deleteAllCommentaires(){
    	comDAO.deleteAll();
        return "All Commentaires are deleted successfully";
    }

}
