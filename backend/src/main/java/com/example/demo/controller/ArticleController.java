package com.example.demo.controller;


import com.example.demo.model.Article;
import com.example.demo.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins ="*")
public class ArticleController {

    @Autowired
    public ArticleService articleService;


    @GetMapping("/getArticles")
    public List<Article> getArticles(){

        return articleService.getArticles();
    }


    @GetMapping("/getArticleByID/{id}")
    public Article getArticleById(@PathVariable int id){
        return articleService.getArticleById(id);
    }

    @GetMapping("/getArticleByTitre/{titre}")
    public Article getArticleByTitre(@PathVariable String titre){
        return articleService.getArticleByTitre(titre);
    }
    @GetMapping("/getArticleByCategorie/{Categorie}")
    public Article getArticleByCategorie(@PathVariable String Categorie){
        return articleService.getArticleByCategorie(Categorie);
    }

    @PostMapping("/saveArticle")
    public Article saveArticle(Article article){
        return articleService.createArticle(article);
    }

    @PutMapping("/updateArticle")
    public Article updateArticle(int id,Article article){
        return articleService.update(id,article);
    }

    @DeleteMapping("/deleteAllArticle")
    public String deleteAll(){
        return articleService.deleteAllArticle();
    }
    @DeleteMapping("/deleteArticle/{id}")
    public String deleteArticle(@PathVariable int  id){
        return articleService.deleteArticleById(id);
    }

}
