package org.crp.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class FlowableTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowableTaskApplication.class, args);
    }

}