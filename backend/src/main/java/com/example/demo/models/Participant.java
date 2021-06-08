package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String FirstName;
    private String LastName;
    private String AdminPhone;

    public Participant(int id, String firstName, String lastName, String adminPhone) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        AdminPhone = adminPhone;
    }

    public Participant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAdminPhone() {
        return AdminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        AdminPhone = adminPhone;
    }
}
