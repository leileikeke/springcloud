package com.leike.serviceribbon.controller;

import com.leike.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: leike
 * @date: 2019-09-28 11:44
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String hi(@RequestParam(required = false) String name) {
        if (name == null){
            return helloService.hiService("leike");
        }else {
            return helloService.hiService(name);
        }
    }

}
