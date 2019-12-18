package com.example.demo.controller;

import com.example.demo.pojo.CommentJSON;
import com.example.demo.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Slf4j
@Api(tags = {"Comment"})
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "comments", produces = MediaType.APPLICATION_JSON_VALUE)
public class CommentController {

    @Resource
    private CommentService commentService;

    @ApiOperation(value = "Get all Comments")
    @RequestMapping(method = RequestMethod.GET)
    public List<CommentJSON> getAll() {
        return commentService.getAllComments();
    }

    @ApiOperation(value = "Add Comment", response = CommentJSON.class)
    @RequestMapping(method = RequestMethod.POST, headers = {"Content-type=application/json"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CommentJSON addComment(@ApiParam(value = "Comment to Add", required = true) @Valid @RequestBody CommentJSON comment) {
        return commentService.addComment(comment);
    }

    @ApiOperation(value = "Get Commments by Topic")
    @RequestMapping(method = RequestMethod.GET, value = "/topic/{topic}")
    public List<CommentJSON> getAllByAuthor(@ApiParam(value = "Topic", required = true) @PathVariable Long topic) {
        return commentService.getCommentsByTopic(topic);
    }
}
