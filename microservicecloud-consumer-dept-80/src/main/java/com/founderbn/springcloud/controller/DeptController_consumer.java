package com.founderbn.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.founderbn.springcloud.base.ApiResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: microservicecloud
 * @description:
 * @author: YangMing
 * @create: 2018-06-1844
 **/
@RestController
@Slf4j
@RequestMapping("consumer")
public class DeptController_consumer {

    @Autowired
    private RestTemplate restTemplate;

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
      private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";

    @GetMapping("/dept/get/{id}")
    public ApiResponse get(@PathVariable("id") long id) {
        log.info("start consumer  get dept  " + id);
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get?id=" + id, ApiResponse.class);
    }


}
