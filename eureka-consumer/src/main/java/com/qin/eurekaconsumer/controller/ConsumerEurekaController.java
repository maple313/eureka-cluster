package com.qin.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer/")
public class ConsumerEurekaController {

    @Autowired
    private RestTemplate restTemplate;

    /*
     *服务名
     * */
    private static final String SERVICE_NAME = "http://EUREKA-PROVIDER";

    @RequestMapping("getProviderTest")
    public List<String> getProviderTest() {
       Object o= restTemplate.getForObject(SERVICE_NAME+"/eurekacluster/getResult", Object.class);
        System.out.println(o);
        return restTemplate.getForObject(SERVICE_NAME+"/eurekacluster/getResult",List.class);
    }
}
