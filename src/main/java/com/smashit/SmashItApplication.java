package com.smashit;

/**
 * Created by Vijay on 29/01/2016.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class SmashItApplication extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SmashItApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SmashItApplication.class, args);
    }
}