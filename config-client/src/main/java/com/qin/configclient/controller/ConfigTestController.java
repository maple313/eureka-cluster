package com.qin.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangZB
 * @date 2019/5/13 23:05
 * @description 分布式配置中心-客户端
 * @version 1.0
 */
@RestController
public class ConfigTestController {

    @Value("${liuxin.name:''}")
    private String name;

    @RequestMapping("/config")
    public String getConfig(){
        return name;
    }
}
