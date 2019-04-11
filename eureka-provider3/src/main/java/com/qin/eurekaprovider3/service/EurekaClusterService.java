package com.qin.eurekaprovider3.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EurekaClusterService {

    /**
    *@Date: 2019/3/21
    *@Desciption:  演示服务提供者
    *
    */
    List<String> getEntity();
}
