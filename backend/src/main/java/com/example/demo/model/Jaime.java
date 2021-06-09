package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class Jaime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_jaime;
    private int id_user;
    private int id_article;

    public Jaime(int id_jaime, int id_user, int id_article) {
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

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_article() {
        return id_article;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }
}
