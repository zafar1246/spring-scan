package com.apiscan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {

    @GetMapping("greetings")
    public String greetings(){
        return "Hello Api hackers";
    }
}
