package com.qin.eurekaprovider2.controller;

import com.qin.eurekaprovider2.service.EurekaClusterService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eurekacluster/")
public class EurekaClusterController {

    @Autowired
    private EurekaClusterService2 eurekaClusterService2;

    @RequestMapping("getResult")
    public Object getResult(){
        return eurekaClusterService2.getEntity();
    }
}
