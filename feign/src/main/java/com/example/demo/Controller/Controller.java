package com.example.demo.Controller;

import com.example.demo.interfaceFile.FeignTest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    private FeignTest feignTest;

    @GetMapping(value = "/hi")
    @HystrixCommand(fallbackMethod = "hi error")
    public String sayHi(@RequestParam(required = false) String name) {
        return feignTest.sayHiFromClientOne( name );
    }

}
