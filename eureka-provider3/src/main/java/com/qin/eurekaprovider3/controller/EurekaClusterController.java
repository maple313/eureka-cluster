package com.qin.eurekaprovider1.controller;

import com.qin.eurekaprovider1.service.EurekaClusterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eurekacluster/")
public class EurekaClusterController {

    @Autowired
    private EurekaClusterService eurekaClusterService;

    @RequestMapping("getResult")
    public Object getResult(){
        return eurekaClusterService.getEntity();
    }
}
