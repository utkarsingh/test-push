package com.docster.internal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping(path = "/test")
    public String testAPI(){

        return "Success";
    }

}
