package com.qin.eurekaconsumer.controller;


import com.qin.eurekaconsumer.service.ConsumerEurekaByFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/consumer/")
public class ConsumerEurekaByFeignController {
    @Autowired
    private ConsumerEurekaByFeignService service;

    @RequestMapping("getFeignProviderTest")
    public List<String> getProviderTest() {
        List<String> list = service.getProviderTest();
        return list;
    }
}
