package com.example.demo.service;

import com.example.demo.helper.CommentMapper;
import com.example.demo.pojo.Comment;
import com.example.demo.pojo.CommentJSON;
import com.example.demo.repository.CommentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class CommentService {

    @Resource
    private CommentRepository commentRepository;

    @Resource
    private CommentMapper commentMapper;

    public List<CommentJSON> getAllComments() {
        List<Comment> commentList = commentRepository.findAll();
        return commentMapper.mapTo(commentList);
    }

    public List<CommentJSON> getCommentsByTopic(Long idTopic) {
        List<Comment> commentList = commentRepository.findByIdTopicOrderByDateDesc(idTopic);
        return commentMapper.mapTo(commentList);
    }

    public CommentJSON addComment(CommentJSON commentJSON) {
        Comment comment = commentRepository.save(commentMapper.mapTo(commentJSON));
        return commentMapper.mapTo(comment);
    }
}
