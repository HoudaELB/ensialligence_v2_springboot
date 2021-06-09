package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_article;
    public int id_user ;
    public String titre;
    public String categorie;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;
    public int nbjaimeart;

    public Article(int id_article, int id_user, String titre, String categorie, String image, int nbjaimeart) {
        this.id_article = id_article;
        this.id_user = id_user;
        this.titre = titre;
        this.categorie = categorie;
        this.image = image;
        this.nbjaimeart = nbjaimeart;
    }

    public Article() {
    }

    public int getIdarticle() {
        return id_article;
    }

    public void setIdarticle(int idarticle) {
        this.id_article = idarticle;
    }

    public int getId() {
        return id_user;
    }

    public void setId(int id) {
        this.id_user = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getNbjaimeart() {
        return nbjaimeart;
    }

    public void setNbjaimeart(int nbjaimeart) {
        this.nbjaimeart = nbjaimeart;
    }
}
