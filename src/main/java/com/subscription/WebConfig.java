package com.subscription;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/hello") // Specify the endpoint
                .allowedOrigins("http://localhost:30002") // Allow requests from your React app
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify allowed methods
                .allowedHeaders("*"); // Allow all headers
    }
}
