package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity(name = "Commentaire")
public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCom;
	
	@OneToOne
    @JoinColumn(name = "idUser")
    private int idUser;
	
	@OneToOne
    @JoinColumn(name = "idArticle")
    private int idArticle;
	
    private String comment;
    
    private int nbJaimeCom;
}
