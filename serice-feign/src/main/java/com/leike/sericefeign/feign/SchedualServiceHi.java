package com.leike.sericefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: leike
 * @date: 2019-09-28 17:24
 */
@FeignClient("service-hi")
public interface SchedualServiceHi {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam("name") String name);

}
