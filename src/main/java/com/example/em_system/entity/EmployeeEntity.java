package com.example.em_system.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    private String emailid;
}
