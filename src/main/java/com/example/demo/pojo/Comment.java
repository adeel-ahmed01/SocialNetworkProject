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
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String content;
    @NotNull(message = "Please enter author id")
    private long idAuthor;
    @NotNull(message = "Please enter topic id")
    private long idTopic;
    @NotNull(message = "Please enter date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate commentDate;

}
