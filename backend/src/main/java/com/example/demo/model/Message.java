package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_msg;
    private int msg;
    private String date_envoi;
    private Boolean is_read;
    private int sender;
    private int receiver;

    public Message(int id_msg, int msg, String date_envoi, Boolean is_read, int sender, int receiver) {
        this.id_msg = id_msg;
        this.msg = msg;
        this.date_envoi = date_envoi;
        this.is_read = is_read;
        this.sender = sender;
        this.receiver = receiver;
    }

    public Message() {
    }

    public int getId_msg() {
        return id_msg;
    }

    public void setId_msg(int id_msg) {
        this.id_msg = id_msg;
    }

    public int getMsg() {
        return msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }

    public String getDate_envoi() {
        return date_envoi;
    }

    public void setDate_envoi(String date_envoi) {
        this.date_envoi = date_envoi;
    }

    public Boolean getIs_read() {
        return is_read;
    }

    public void setIs_read(Boolean is_read) {
        this.is_read = is_read;
    }

    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }
}
