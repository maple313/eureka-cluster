package com.qin.eurekaprovider3.service.impl;

import com.qin.eurekaprovider3.service.EurekaClusterService;

import java.util.ArrayList;
import java.util.List;

public class EurekaClusterImpl implements EurekaClusterService {
    @Override
    public List<String> getEntity() {
        List<String> list=new ArrayList<>();
        list.add("provider3提供的服务！");
        return list;
    }
}
