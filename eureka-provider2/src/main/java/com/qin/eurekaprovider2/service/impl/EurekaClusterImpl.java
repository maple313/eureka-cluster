package com.qin.eurekaprovider2.service.impl;

import com.qin.eurekaprovider2.service.EurekaClusterService;

import java.util.ArrayList;
import java.util.List;

public class EurekaClusterImpl implements EurekaClusterService {
    @Override
    public List<String> getEntity() {
        List<String> list=new ArrayList<>();
        list.add("provider2提供的服务！");
        return list;
    }
}
