package com.example.demo.dao;

import com.example.demo.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurDAO extends JpaRepository<Utilisateur,Integer> {
    @Override
    List<Utilisateur> findAll();

    @Query("select u from Utilisateur u where u.id_user = ?1")
    Utilisateur findUtilisateurById_user(int id_user);

    @Query("select u from Utilisateur u where u.first_name like %?1%")
    Utilisateur findUtilisateurByFirst_name(String fname);

    @Query("select u from Utilisateur u where u.last_name like %?1%")
    Utilisateur findUtilisateurByLast_name(String lname);
}
