package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
public class TopicJSON implements Serializable {
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
    private List<CommentJSON> commentList;
    @NotEmpty
    private UserJSON author;
}
