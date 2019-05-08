package com.qin.eurekazuulgateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: WangZB
 * @date: 2019/5/8 21:39
 * @description:
 * @version: 1.0
 */
@Controller
@RequestMapping("/zuul/")
public class ZuulTestController {

    @ResponseBody
    @RequestMapping("getMessage")
    public String zuulTest(){
        return "zuul test!";
    }
}
