package com.qin.eurekaprovider3.controller;

import com.qin.eurekaprovider3.service.EurekaClusterService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eurekacluster/")
public class EurekaClusterController {

    @Autowired
    private EurekaClusterService3 eurekaClusterService3;

    @RequestMapping("getResult")
    public Object getResult(){
        return eurekaClusterService3.getEntity();
    }
}
