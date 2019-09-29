package com.leike.servicefeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: leike
 * @date: 2019-09-28 17:24
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @GetMapping("/")
    String sayHiFromClientOne(@RequestParam(value = "name",required = false) String name);

}
