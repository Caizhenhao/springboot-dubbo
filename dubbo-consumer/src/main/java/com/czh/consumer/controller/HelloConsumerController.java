package com.czh.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.czh.api.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2019/5/21
 * Time:21:03
 */
@RestController
public class HelloConsumerController {
    @Reference(version = "${demo.service.version}")
    private HelloService helloService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        System.out.println("参数="+name);
        return helloService.sayHello(name);
    }

}
