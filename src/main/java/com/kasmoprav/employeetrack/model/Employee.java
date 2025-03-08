package com.kasmoprav.employeetrack.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String emailId;

    private Long age;

    private String aadharCard;

    private String panCard;

    private String gender;

    private String dateOfBirth;

    private String phoneNumber;

    private String currentAddress;

    private String permantAddress;

    private String maritalStatus;

    private String profileImage;

}
