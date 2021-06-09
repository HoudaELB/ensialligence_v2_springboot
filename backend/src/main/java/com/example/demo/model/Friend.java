package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_friend;
    private int id_user1;
    private int id_user2;

    public Friend(int id_friend, int id_user1, int id_user2) {
        this.id_friend = id_friend;
        this.id_user1 = id_user1;
        this.id_user2 = id_user2;
    }

    public Friend() {
    }

    public int getId_friend() {
        return id_friend;
    }

    public void setId_friend(int id_friend) {
        this.id_friend = id_friend;
    }

    public int getId_user1() {
        return id_user1;
    }

    public void setId_user1(int id_user1) {
        this.id_user1 = id_user1;
    }

    public int getId_user2() {
        return id_user2;
    }

    public void setId_user2(int id_user2) {
        this.id_user2 = id_user2;
    }
}
