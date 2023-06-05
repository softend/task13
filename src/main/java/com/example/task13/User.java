package com.example.task13;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Value("${student.name}")
    String name;

    @Value("${student.last_name}")

    String lastName;

    @Value("${student.group}")
    String group;

    @PostConstruct
    public void init(){
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(group);
    }
}
