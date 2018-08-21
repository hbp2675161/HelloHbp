package com.sprintboot.hbp.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ASUS on 2018/7/13.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController
{
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello,spring boot";
    }

    @RequestMapping("/hello/{name}")
    public String helloWhat(@PathVariable String name)
    {
        return "hello,spring boot:--0" + name;
    }
}
