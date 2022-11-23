package com.zqh.cloud.demo.cloudservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudServiceApplication {

    private final static Logger logger = LoggerFactory.getLogger(CloudServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceApplication.class, args);
        logger.info("启动");
    }

}
