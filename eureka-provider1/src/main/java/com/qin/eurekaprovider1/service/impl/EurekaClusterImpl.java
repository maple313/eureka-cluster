package com.qin.eurekaprovider1.service.impl;

import com.qin.eurekaprovider1.service.EurekaClusterService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EurekaClusterImpl implements EurekaClusterService {
    @Override
    public List<String> getEntity() {
        List<String> list=new ArrayList<>();
        list.add("provider1提供的服务！");
        return list;
    }
}
