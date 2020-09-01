package com.yang.testdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class Controller {
    @PostMapping("doit")
    public String doit(){
        return "haha_ok";
    }
}
