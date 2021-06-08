package com.example.demo.DAOs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Commentaire;

public interface CommentaireDAO extends JpaRepository<Commentaire,Integer> {

	@Override
    List<Commentaire> findAll();
	
	@Query("select c from Commentaire c where c.idCommentaire = ?1")
	Commentaire findCommentaireByIdCom(int idCommentaire);

    @Query("select c from Commentaire c where c.idUser like %?1%")
    Commentaire findCommentaireByIdUser(int idUser);

    @Query("select c from Commentaire c where c.idArticle like %?1%")
    Commentaire findCommentaireByIdArticle(int idArticle);
}
