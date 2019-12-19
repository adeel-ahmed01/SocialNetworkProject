package com.example.demo.helper;

import com.example.demo.pojo.Comment;
import com.example.demo.pojo.CommentJSON;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CommentMapper {

    public Comment mapTo(CommentJSON commentJSON) {
        Assert.notNull(commentJSON, "The commentJSON must not be null");
        Comment comment = new Comment();

        comment.setContent(commentJSON.getContent());
        comment.setIdAuthor(commentJSON.getIdAuthor());
        comment.setIdTopic(commentJSON.getIdTopic());
        comment.setCommentDate(commentJSON.getDateComment());

        return comment;
    }

    public CommentJSON mapTo(Comment comment) {
        Assert.notNull(comment, "The comment must not be null");
        CommentJSON commentJSON = new CommentJSON();

        commentJSON.setId(comment.getId());
        commentJSON.setContent(comment.getContent());
        commentJSON.setIdAuthor(comment.getIdAuthor());
        commentJSON.setIdTopic(comment.getIdTopic());
        commentJSON.setDateComment(comment.getCommentDate());

        return commentJSON;
    }

    public List<CommentJSON> mapTo(List<Comment> commentList) {
        Assert.notNull(commentList, "The commentList must not be null");
        return commentList.stream().map(this::mapTo).collect(Collectors.toList());
    }
}
