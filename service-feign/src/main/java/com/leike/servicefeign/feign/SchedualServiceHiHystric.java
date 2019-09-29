package com.leike.servicefeign.feign;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: leike
 * @date: 2019-09-28 18:06
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry " + name;
    }
}
