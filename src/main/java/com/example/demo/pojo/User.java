package com.example.demo.pojo;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty
    @Column(unique = true)
    private String email;
    @NotEmpty
    private String nom;
    @NotEmpty
    private String prenom;
    @NotEmpty
    private String password;
    private String access;

}
