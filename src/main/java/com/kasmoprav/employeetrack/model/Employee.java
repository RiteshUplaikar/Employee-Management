package com.kasmoprav.employeetrack.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private int age;
    private Date dob;
    private String adharCardNo;
    private String panCardNo;
    private String gender;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDateTime joiningDate;
    private String designation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAdharCardNo() {
        return adharCardNo;
    }

    public void setAdharCardNo(String adharCardNo) {
        this.adharCardNo = adharCardNo;
    }

    public String getPanCardNo() {
        return panCardNo;
    }

    public void setPanCardNo(String panCardNo) {
        this.panCardNo = panCardNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
