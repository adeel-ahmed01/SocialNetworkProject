package com.example.demo.controller;

import com.example.demo.pojo.TopicJSON;
import com.example.demo.service.TopicService;
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
@Api(tags = {"Topic"})
@RestController
// Be careful with cross-origin !!
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "topics", produces = MediaType.APPLICATION_JSON_VALUE)
public class TopicController {

    @Resource
    private TopicService topicService;

    @ApiOperation(value = "Get all Topics")
    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<TopicJSON> getAll() {
        return topicService.getAllTopics();
    }

    @ApiOperation(value = "Add Topic", response = TopicJSON.class)
    @RequestMapping(value = "add", method = RequestMethod.POST, headers = {"Content-type=application/json"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public TopicJSON addTopic(@ApiParam(value = "Topic to Add", required = true) @Valid @RequestBody TopicJSON topic) {
        // test with @Valid : @Valid @RequestBody ... get Spring Bad Request 400 if NotEmpty
        // or JPA RollbackException (DB side)
        return topicService.addTopic(topic);
    }

}
