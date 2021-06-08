package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity(name = "Friend")
public class Friend {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFriend;
	
	@OneToOne
    @JoinColumn(name = "idUser")
    private int idUser1;
	
	@OneToOne
    @JoinColumn(name = "idUser")
    private int idUser2;
    
}
