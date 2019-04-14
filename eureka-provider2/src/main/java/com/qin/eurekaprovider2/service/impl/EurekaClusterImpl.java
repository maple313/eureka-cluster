package com.qin.eurekaprovider2.service.impl;

import com.qin.eurekaprovider2.service.EurekaClusterService2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EurekaClusterImpl implements EurekaClusterService2 {
    @Override
    public List<String> getEntity() {
        List<String> list=new ArrayList<>();
        list.add("provider2提供的服务！");
        return list;
    }
}
