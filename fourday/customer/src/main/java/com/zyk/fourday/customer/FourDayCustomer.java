package com.zyk.fourday.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zyk
 * @description
 * @date 2020-01-06 10:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FourDayCustomer {

    public static void main(String[] args) {
        SpringApplication.run(FourDayCustomer.class, args);
    }
}