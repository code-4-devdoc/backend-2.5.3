// WebConfig.java

package com.devdoc.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @SuppressWarnings("null")
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        // 개발환경(localhost) & 배포환경(krampoline) - URL 주소 확인
                        .allowedOrigins("http://localhost:3000", "https://k7dcd693eb941a.user-app.krampoline.com")
                        .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}