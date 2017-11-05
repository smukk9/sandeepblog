package com.sandeep.blogdiscover.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/")
public class HomeWelcome {

    @RequestMapping
     public String home(){
         return "Eureka Server up and running";
    }

}
