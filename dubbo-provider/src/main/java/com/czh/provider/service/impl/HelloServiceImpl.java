package com.czh.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.czh.api.service.HelloService;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2019/5/21
 * Time:20:56
 */
@Service(version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ",This is springboot-dubbo test";
    }
}
