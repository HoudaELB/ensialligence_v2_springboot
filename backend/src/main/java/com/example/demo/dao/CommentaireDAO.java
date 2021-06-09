package com.example.demo.dao;

import com.example.demo.model.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentaireDAO extends JpaRepository<Commentaire,Integer> {
    @Override
    List<Commentaire> findAll();

    @Query("select c from Commentaire c where c.id_com = ?1")
    Commentaire findCommentaireById_com(int id_com);

    @Query("select c from Commentaire c where c.id_user = ?1")
    Commentaire findCommentaireById_user(int id_user);

    @Query("select c from Commentaire c where c.id_article = ?1")
    Commentaire findCommentaireById_article(int id_article);

}
