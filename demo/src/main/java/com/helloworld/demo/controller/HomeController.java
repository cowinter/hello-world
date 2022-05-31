package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shen
 * @Description home
 * @createTime 2022-05-30
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "hello haha";
    }
}
