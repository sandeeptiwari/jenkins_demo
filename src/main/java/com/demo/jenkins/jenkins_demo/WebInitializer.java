package com.demo.jenkins.jenkins_demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class WebInitializer extends SpringBootServletInitializer {   
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JenkinsDemoApplication.class);
    }    
}