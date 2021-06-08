package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity(name = "Message")
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMsg;
	
    private String msg;
    
    @Temporal(TemporalType.TIMESTAMP)
    private String date_envoi;
    
    private boolean isRead;
    
    @OneToOne
    @JoinColumn(name = "idUser")
    private int idSender;
    
    @OneToOne
    @JoinColumn(name = "idUser")
    private int idReceiver;

}
