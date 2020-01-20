package com.example.demo.helper;

import com.example.demo.pojo.Topic;
import com.example.demo.pojo.TopicJSON;
import com.example.demo.service.CommentService;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TopicMapper {

    @Resource
    CommentService commentService;

    @Resource
    UserService userService;

    public Topic mapTo(TopicJSON topicJSON) {
        Assert.notNull(topicJSON, "The topicJSON must not be null");
        Topic t = new Topic();
        t.setTitle(topicJSON.getTitle());
        t.setBody(topicJSON.getBody());
        t.setCategory(topicJSON.getCategory());
        return t;
    }

    public TopicJSON mapTo(Topic topic) {
        Assert.notNull(topic, "The topic must not be null");
        TopicJSON tJSON = new TopicJSON();
        tJSON.setId(topic.getId());
        tJSON.setTitle(topic.getTitle());
        tJSON.setPostDate(topic.getPostDate());
        tJSON.setBody(topic.getBody());
        tJSON.setCategory(topic.getCategory());
        tJSON.setCommentList(commentService.getCommentsByTopic(topic.getId()));
        tJSON.setAuthor(userService.getUserById(topic.getId()));
        return tJSON;
    }

    public List<TopicJSON> mapTo(List<Topic> topicList) {
        Assert.notNull(topicList, "The topicList must not be null");
        return topicList.stream()
                .map(this::mapTo)
                .collect(Collectors.toList());
    }
}
