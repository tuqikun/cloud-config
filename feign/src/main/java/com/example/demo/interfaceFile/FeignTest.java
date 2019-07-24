package com.example.demo.interfaceFile;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")
public interface FeignTest {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)

    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
