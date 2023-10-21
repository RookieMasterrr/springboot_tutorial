package com.example.sprintbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan
@SpringBootApplication
public class SprintbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintbootDemoApplication.class, args);
    }

}
