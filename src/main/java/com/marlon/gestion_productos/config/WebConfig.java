package com.marlon.gestion_productos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer(){

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")  // Aplica CORS a tus endpoints
                        .allowedOrigins("https://symphonious-pegasus-a9deed.netlify.app")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowCredentials(true);

            }
        };



    };



}
