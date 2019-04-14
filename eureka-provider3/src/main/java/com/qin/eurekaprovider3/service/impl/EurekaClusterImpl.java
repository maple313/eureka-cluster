package com.qin.eurekaprovider3.service.impl;

import com.qin.eurekaprovider3.service.EurekaClusterService3;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EurekaClusterImpl implements EurekaClusterService3 {
    @Override
    public List<String> getEntity() {
        List<String> list=new ArrayList<>();
        list.add("provider3提供的服务！");
        return list;
    }
}
