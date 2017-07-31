package com.waites.topicvoter.controllers;


import com.waites.topicvoter.models.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class TopicController {

    @RequestMapping("/")
    public String index(Model model){

        Topic first = new Topic(1, "Java Spring", "Learning how to integrate");
        Topic second = new Topic(2, "Back End", "some other stuff");
        Topic third = new Topic(3, "React and Redux", "What even are these?");
        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(first);
        topics.add(second);
        topics.add(third);
        model.addAttribute("topics", topics);
        return "index";
    }
}
