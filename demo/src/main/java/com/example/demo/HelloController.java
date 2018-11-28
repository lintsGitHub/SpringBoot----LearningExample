package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","http://192.168.7.141:8081");
        return "hello('hello')";
    }

    @RequestMapping("/hello2")
    public String hello2(String seyhello){
        System.out.println(seyhello);
        return seyhello + "('hello')";
    }
}
