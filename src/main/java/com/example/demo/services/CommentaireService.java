package com.example.demo.services;

import com.example.demo.dao.CommentaireDAO;
import com.example.demo.model.Commentaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireService {
    @Autowired
    CommentaireDAO commentaireDAO;

    public Commentaire addCommentaire(Commentaire com){
        return commentaireDAO.save(com);
    }

    public List<Commentaire> getCommentaires(){
        return commentaireDAO.findAll();
    }

    public Commentaire getCommentaireById(int id){
        return commentaireDAO.findCommentaireById_com(id);
    }

    public Commentaire getCommentaireByIdUser(int idUser){
        return commentaireDAO.findCommentaireById_user(idUser);
    }

    public Commentaire getCommentaireByIdArticle(int idArticle){
        return commentaireDAO.findCommentaireById_article(idArticle);
    }

    public Commentaire update(Commentaire com){
        return commentaireDAO.save(com);
    }

    public String deleteCommentaireById(int id){
        commentaireDAO.deleteById(id);
        return "Commentaire "+id+" is deleted successfully";
    }

    public String deleteAllCommentaires(){
        commentaireDAO.deleteAll();
        return "All Commentaires are deleted successfully";
    }
}
