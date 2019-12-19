package com.example.demo.pojo;


import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AuthentificationJSON {

    @NotEmpty
    private String email;
    @NotEmpty
    private String password;

}
