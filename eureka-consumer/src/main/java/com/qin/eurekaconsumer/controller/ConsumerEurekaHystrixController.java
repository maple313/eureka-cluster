package com.qin.eurekaconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author  WZB
 * @date 2019/4/22 21:48
 * @description 服务熔断
 */
@RestController
@RequestMapping("/consumer/")
public class ConsumerEurekaHystrixController {

    @Autowired
    private RestTemplate restTemplate;

    /*
     *服务名
     *
     * */
    private static final String SERVICE_NAME = "http://EUREKA-PROVIDER";

    @RequestMapping("getProviderTest")
    @HystrixCommand(fallbackMethod ="dealExceptionByHystrix")
    public List<String> getProviderTest() {
        //手动抛出异常，模拟断路器功能
        int x=2/0;
        List<String> o= restTemplate.getForObject(SERVICE_NAME+"/eurekacluster/getResult", List.class);
        System.out.println(o);
        return o;
    }

    public String dealExceptionByHystrix(){
        return  "failed !";
    }
}
