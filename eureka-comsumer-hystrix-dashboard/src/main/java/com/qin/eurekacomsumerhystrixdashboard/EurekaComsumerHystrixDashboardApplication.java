package com.qin.eurekacomsumerhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class EurekaComsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaComsumerHystrixDashboardApplication.class, args);
    }

}
