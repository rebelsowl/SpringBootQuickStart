package com.example.courseapidata;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    /*
    private List<Topic> topics= new ArrayList<>(Arrays.asList(
        new Topic("spring", "sf","sfdesc"),
        new Topic("java", "JJ", "javadesc"),
        new Topic("javaScript", "JSJS", "jS description")
    ));
    */

    public List<Topic> getAllTopics(){
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);   //findAll cames from CrudRepository predefined methon
        return topics;
    }

    public Optional<Topic> getTopic(String id){
        //return topics.stream().filter(t -> t.getid().equals(id)).findFirst().get();   
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic){
        //topics.add(topic);
        topicRepository.save(topic);
    }
    public void uptadeTopic(String id, Topic topic){
        topicRepository.save(topic);
    }
    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    }








    
}