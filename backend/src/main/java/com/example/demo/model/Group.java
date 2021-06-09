package com.example.demo.model;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="Groupe")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idGroup;
    private int idParticipant;
    private int idAdmin;
    private String Admin;
    private String GroupName;
    private String AdminPhone;
    private String Source;
    private String Destination;
    private String Time;
    private String Day;
    private String Month;
    private String year;
    //private List<User> users;


    public Group(int idGroup, String admin, String groupName, String adminPhone, String source, String destination, String time, String day, String month, String year) {
        this.idGroup = idGroup;
        Admin = admin;
        GroupName = groupName;
        AdminPhone = adminPhone;
        Source = source;
        Destination = destination;
        Time = time;
        Day = day;
        Month = month;
        this.year = year;
    }

    public Group() {
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(int idParticipant) {
        this.idParticipant = idParticipant;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String admin) {
        Admin = admin;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getAdminPhone() {
        return AdminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        AdminPhone = adminPhone;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
