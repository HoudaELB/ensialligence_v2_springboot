package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table
public class Jaime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_jaime;
    private String id_user;
    private String id_article;

    public Jaime(int id_jaime, String id_user, String id_article) {
        this.id_jaime = id_jaime;
        this.id_user = id_user;
        this.id_article = id_article;
    }

    public Jaime() {
    }

    public int getId_jaime() {
        return id_jaime;
    }

    public void setId_jaime(int id_jaime) {
        this.id_jaime = id_jaime;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_article() {
        return id_article;
    }

    public void setId_article(String id_article) {
        this.id_article = id_article;
    }
}
