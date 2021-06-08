package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Article;

import java.util.List;

@Repository
public interface ArticleDAO extends JpaRepository<Article,Integer> {
    @Override
    List<Article> findAll();

    @Query("select u from Article u where u.id_article = ?1")
    Article findArticleById(int id);

    @Query("select u from Article u where u.titre like %?1%")
    Article findArticleByTitre(String titre);

    @Query("select u from Article u where u.categorie like %?1%")
    Article findArticleByCategorie(String categorie);
}
