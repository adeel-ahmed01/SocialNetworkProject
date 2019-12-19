package com.example.demo.pojo;


import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class UserJSON implements Serializable {

    private int id;
    @NotEmpty
    @Column(unique = true)
    private String email;
    @NotEmpty
    private String nom;
    @NotEmpty
    private String prenom;
}
