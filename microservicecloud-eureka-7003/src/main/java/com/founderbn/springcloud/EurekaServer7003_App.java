package com.founderbn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: microservicecloud
 * @description: Eureka server
 * @author: YangMing
 * @create: 2018-06-19 17:05
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_App extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(EurekaServer7003_App.class);

    }

    public static void main(String[] args) {

        SpringApplication.run(EurekaServer7003_App.class);
    }
}
