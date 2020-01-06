package com.zyk.fourday.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyk
 * @description
 * @date 2020-01-06 15:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider {
    public static void main(String[] args) {
        SpringApplication.run(Provider.class,args);
    }
}
