package com.leike.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: leike
 * @date: 2019-09-28 14:04
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String hello(@RequestParam(required = false) String name) {
        return "hi " + name + ",i am from port:" + port;
    }

}
