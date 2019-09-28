package com.leike.sericefeign.controller;

import com.leike.sericefeign.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: leike
 * @date: 2019-09-28 17:27
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("/")
    public String sayHi(@RequestParam(required = false) String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
