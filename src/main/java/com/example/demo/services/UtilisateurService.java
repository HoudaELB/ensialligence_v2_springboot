package com.example.demo.services;

import com.example.demo.dao.UtilisateurDAO;
import com.example.demo.models.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    UtilisateurDAO utilisateurDAO;


    public Utilisateur createUtilisateur(Utilisateur utilisateur){
        return utilisateurDAO.save(utilisateur);
    }

    public List<Utilisateur> getUtilisateurs(){
        return utilisateurDAO.findAll();
    }

    public Utilisateur getUtilisateurById(int id){
        return utilisateurDAO.findUtilisateurById_user(id);
    }

    public Utilisateur getUtilisateurByfname(String fname){
        return utilisateurDAO.findUtilisateurByFirst_name(fname);
    }

    public Utilisateur getUtilisateurBylname(String lname){
        return utilisateurDAO.findUtilisateurByLast_name(lname);
    }
    public Utilisateur update(int id, Utilisateur utilisateur){
        utilisateur.setId_user(id);
        return utilisateurDAO.save(utilisateur);
    }

    public String deleteUtilisateurById(int id){
        utilisateurDAO.deleteById(id);
        return "Utilisateur "+id+" is deleted successfully";
    }
    public String deleteAllUtilisateur(){
        utilisateurDAO.deleteAll();
        return "All Utilisateurs are deleted successfully";
    }

}
