package com.huseyinaydin.springbootkodluyoruz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Security inactive
//@SpringBootApplication(exclude = {
//        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
//        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
//)
@SpringBootApplication
public class SpringBootKodluyoruzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKodluyoruzApplication.class, args);
    }

}
