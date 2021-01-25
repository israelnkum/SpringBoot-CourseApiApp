package com.techlineafrica.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","Spring","Spring Framework Description"),
            new Topic("java","Core Java","Core Java Description"),
            new Topic("javascript","JavaScript","JavaScript Description")
    ));

    List<Topic> getTopics() {
        return topics;
    }

    Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (Topic top : topics) {
            if (top.getId().equals(id)){
                top.setName(topic.getName());
                top.setDescription(topic.getDescription());
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}

