package com.techlineafrica.services;

import com.techlineafrica.entities.Topic;
import com.techlineafrica.repositories.TopicRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    
    private final TopicRepository topicRepository;
    
   /* private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","Spring","Spring Framework Description"),
            new Topic("java","Core Java","Core Java Description"),
            new Topic("javascript","JavaScript","JavaScript Description")
    ));*/
    
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }
    
   public List<Topic> getTopics() {
//        return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    
   public Topic getTopic(String id){
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    return topicRepository.findById(id).get();
    }
    
    public void addTopic(Topic topic) {
//        topics.add(controllers);
        topicRepository.save(topic);
    }
    
    public void updateTopic(Topic topic) {
        /*for (Topic top : topics) {
            if (top.getId().equals(id)){
                top.setName(controllers.getName());
                top.setDescription(controllers.getDescription());
                return;
            }
        }*/
        
        topicRepository.save(topic);
    }
    
    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        
        topicRepository.deleteById(id);
    }
}

