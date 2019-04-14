package com.qin.eurekaconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "EUREKA-PROVIDER")
public interface ConsumerEurekaByFeignService {

    @RequestMapping(value = "/eurekacluster/getResult")
    List<String> getProviderTest();
}
