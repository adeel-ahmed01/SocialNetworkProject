package com.example.demo.service;

import com.example.demo.helper.TopicMapper;
import com.example.demo.pojo.Topic;
import com.example.demo.pojo.TopicJSON;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.TopicRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class TopicService {

    @Resource
    private TopicRepository topicRepository;

    @Resource
    private CommentRepository commentRepository;

    @Resource
    private TopicMapper topicMapper;

    public List<TopicJSON> getAllTopics() {
        log.info("Called for getAllTopics ...");
        List<Topic> topicList = topicRepository.findAll();
        return topicMapper.mapTo(topicList);
    }

    public TopicJSON addTopic(TopicJSON topic) {
        Topic t = topicRepository.save(topicMapper.mapTo(topic));
        return topicMapper.mapTo(t);
    }


}
