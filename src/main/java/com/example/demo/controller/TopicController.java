package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.TopicJSON;
import com.example.demo.service.TopicService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Api(tags = {"Topic"})
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "topics", produces = MediaType.APPLICATION_JSON_VALUE)
public class TopicController {

	  @Resource
	    private TopicService topicService;

	    @ApiOperation(value = "Get all Topics")
	    @RequestMapping(method = RequestMethod.GET)
	    public List<TopicJSON> getAll() {
	        return topicService.getAllTopics();
	    }
}
