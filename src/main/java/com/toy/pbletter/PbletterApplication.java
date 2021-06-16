package com.toy.pbletter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@RefreshScope
@EnableFeignClients
@EnableCircuitBreaker
public class PbletterApplication {

    public static void main(String[] args) {
        SpringApplication.run(PbletterApplication.class, args);
    }

}
