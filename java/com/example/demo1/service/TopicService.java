package com.example.demo1.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import org.springframework.stereotype.Service;
 
import com.example.demo1.Topic;
 
@Service
public class TopicService {
 
    
    List<Topic> topicList =  new ArrayList( Arrays.asList(
             new Topic("1", "java", "basic topics of java"),
             new Topic("2", "C++", "basic topics of C++"),
             new Topic("5", "python", "loops for python")));

    public  List<Topic>  getAllTopics(){
        return topicList;
    }
    public  Topic  getTopic(String id){
    return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();

    }
    
    public  void  addTopic(Topic topic){
        topicList.add(topic);
    }
    public  void  updateTopic(String id,Topic topic){
        for(int i = 0; i<topicList.size(); i++) {
            Topic t = topicList.get(i);
            if(t.getId().equals(id)) {
                topicList.set(i, topic);
            }
        }

    }
    public void deleteTopic(String id) {
        // TODO Auto-generated method stub
        topicList.removeIf(t -> t.getId().equals(id));
    }

}