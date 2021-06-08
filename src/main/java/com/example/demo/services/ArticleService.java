package com.example.demo.services;


import com.example.demo.DAOs.ArticleDAO;
import com.example.demo.models.Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    ArticleDAO articleDAO;

    public Article createArticle(Article article){
        return articleDAO.save(article);
    }

    public List<Article> getArticles(){
        return articleDAO.findAll();
    }

    public Article getArticleById(int id){
        return articleDAO.findArticleById(id);
    }

    public Article getArticleByTitre(String titre){
        return articleDAO.findArticleByTitre(titre);
    }

    public Article getArticleByCategorie(String categorie){
        return articleDAO.findArticleByCategorie(categorie);
    }
    public Article update(int id, Article article){
         article.setIdarticle(id);
         return articleDAO.save(article);
    }

    public String deleteArticleById(int id){
        articleDAO.deleteById(id);
        return "Article "+id+" is deleted successfully";
    }
    public String deleteAllArticle(){
        articleDAO.deleteAll();
        return "All Articles are deleted successfully";
    }

}
