package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class CommentJSON implements Serializable {

    private Long id;
    @NotEmpty
    private String content;
    @NotNull(message = "Please enter author id")
    private long idAuthor;
    @NotNull(message = "Please enter topic id")
    private long idTopic;
    @NotNull(message = "Please enter date")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

}
