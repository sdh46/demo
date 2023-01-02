package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{
    @GetMapping("/")
    public String home(){
        return "Hello";
    }
}

///1f436f3586c1219dbfa243d50ace13ef685d2bc5

//    mvn sonar:sonar \
//        -Dsonar.projectKey=sefsfe \
//        -Dsonar.host.url=http://133.186.151.141:9000 \
//        -Dsonar.login=1f436f3586c1219dbfa243d50ace13ef685d2bc5