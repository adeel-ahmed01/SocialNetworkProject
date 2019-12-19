package com.example.demo.helper;

import com.example.demo.pojo.Topic;
import com.example.demo.pojo.TopicJSON;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TopicMapper {

    public Topic mapTo(TopicJSON topicJSON) {
        Assert.notNull(topicJSON, "The topicJSON must not be null");
        Topic t = new Topic();
        // must not set id !
        t.setTitle(topicJSON.getTitle());
        t.setBody(topicJSON.getBody());
        t.setCategory(topicJSON.getCategory());
        return t;
    }

    public TopicJSON mapTo(Topic topic) {
        Assert.notNull(topic, "The topic must not be null");
        TopicJSON tJSON = new TopicJSON();
        tJSON.setTitle(topic.getTitle());
        tJSON.setBody(topic.getBody());
        tJSON.setCategory(topic.getCategory());
        tJSON.setId(topic.getId());
        return tJSON;
    }

    public List<TopicJSON> mapTo(List<Topic> topicList) {
        Assert.notNull(topicList, "The bookList must not be null");
        return topicList.stream().map(this::mapTo).collect(Collectors.toList());
    }
}
