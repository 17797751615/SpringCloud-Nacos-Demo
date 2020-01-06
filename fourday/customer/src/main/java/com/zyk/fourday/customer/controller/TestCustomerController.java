package com.zyk.fourday.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zyk
 * @description
 * @date 2020-01-06 10:25
 */
@RestController
public class TestCustomerController {
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Autowired
    private  RestTemplate restTemplate;


    @GetMapping(value = "/test/{str}")
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://zyk-provider/provider/" + str, String.class);
    }
}