package com.techlineafrica.controllers;

import com.techlineafrica.entities.Topic;
import com.techlineafrica.services.TopicService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class TopicController {

    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getTopics();
    }

    //get request to get com.techlineafrica.controllers based on ID
    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    //post request to add new com.techlineafrica.controllers
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    //post request to add new com.techlineafrica.controllers
    @RequestMapping(method = RequestMethod.PUT, value = "/topics")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic);
    }

    //post request to add new com.techlineafrica.controllers
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic( @PathVariable String id){
        topicService.deleteTopic(id);
    }
}
