package com.sandeep.blogconfig.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class ConfigHome {

    @RequestMapping(method = RequestMethod.GET)
    public String welcome(){

        return "Config Server up and running";
    }

}
