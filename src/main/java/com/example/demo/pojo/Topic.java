package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String title;
    @NotNull(message = "Please enter date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate postDate;
    @NotEmpty
    private String body;
    @NotEmpty
    private String category;
    @NotNull
    private int idAuthor;

}
