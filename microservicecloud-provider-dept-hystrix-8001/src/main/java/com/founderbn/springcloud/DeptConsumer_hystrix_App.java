package com.founderbn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: microservicecloud
 * @description: 启动类
 * @author: YangMing
 * @create: 2018-06-25 22:15
 **/
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptConsumer_hystrix_App extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DeptConsumer_hystrix_App.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_hystrix_App.class);

    }
}
