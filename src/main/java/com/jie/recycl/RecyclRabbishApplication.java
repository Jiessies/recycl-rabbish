package com.jie.recycl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@EnableDiscoveryClient
@EnableTransactionManagement
@SpringBootApplication
public class RecyclRabbishApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecyclRabbishApplication.class, args);
    }
}
