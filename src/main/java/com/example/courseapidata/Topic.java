package com.example.courseapidata;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String id;
    private String  name;
    private String description;


    public Topic(){
    }

    public Topic(String id, String name, String des){
        super();
        this.id=id;
        this.name=name;
        this.description=des;
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



}