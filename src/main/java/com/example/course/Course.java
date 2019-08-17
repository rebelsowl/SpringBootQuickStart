package com.example.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.courseapidata.Topic;

@Entity
public class Course {

    @Id
    private String id;
    private String  name;
    private String description;

    @ManyToOne
    private Topic topic;

    public Course(){
    }

    public Course(String id, String name, String des, String topicId){
        super();
        this.id=id;
        this.name=name;
        this.description=des;
        this.topic =new Topic(topicId, "", "");
    }

    public String getid(){
        return this.id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String des){
        this.description=des;
    }

    public void setTopic(Topic top){
        this.topic= top;
    }
    public Topic getTopic(){
        return this.topic;
    }


}