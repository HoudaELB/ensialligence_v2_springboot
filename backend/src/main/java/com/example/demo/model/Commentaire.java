package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_com;
    private int id_user;
    private int id_article;
    private String comment;
    private int nbjaimecom;

    public Commentaire(int id_com, int id_user, int id_article, String comment, int nbjaimecom) {
        this.id_com = id_com;
        this.id_user = id_user;
        this.id_article = id_article;
        this.comment = comment;
        this.nbjaimecom = nbjaimecom;
    }

    public Commentaire() {
    }

    public int getId_com() {
        return id_com;
    }

    public void setId_com(int id_com) {
        this.id_com = id_com;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getNbjaimecom() {
        return nbjaimecom;
    }

    public void setNbjaimecom(int nbjaimecom) {
        this.nbjaimecom = nbjaimecom;
    }
}
