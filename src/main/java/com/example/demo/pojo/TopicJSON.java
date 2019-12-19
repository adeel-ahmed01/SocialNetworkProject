package com.example.demo.pojo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Data
public class TopicJSON implements Serializable {
    private Long id;
    @NotEmpty
    private String title;
    @NotEmpty
    private String body;
    @NotEmpty
    private String category;
    private List<CommentJSON> commentList;
}
