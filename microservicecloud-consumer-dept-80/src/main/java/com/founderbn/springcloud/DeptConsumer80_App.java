package com.founderbn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: microservicecloud
 * @description: 启动类
 * @author: YangMing
 * @create: 2018-06-17 13:08
 **/

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DeptConsumer80_App.class);

    }

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class);
    }
}
