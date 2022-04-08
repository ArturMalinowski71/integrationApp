package com.envelo.businesstrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class BusinessTripApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessTripApplication.class, args);
    }
}
