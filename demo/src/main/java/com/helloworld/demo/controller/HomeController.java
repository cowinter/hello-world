package com.helloworld.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@Slf4j
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        log.info("{}/{} success","home","hello");
        return "hello haha";
    }
}
