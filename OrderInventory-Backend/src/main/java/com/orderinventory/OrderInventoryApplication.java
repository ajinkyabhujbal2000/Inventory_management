package com.orderinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = UserDetailsServiceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.orderinventory", "com.orderinventory.config"})
public class OrderInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderInventoryApplication.class, args);
    }

}
