package com.example.interceptor1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptor());
        registry.addInterceptor(legacyInterceptor());
    }

    @Bean
    public HandlerInterceptor apiLoggingInterceptor() {
        return new APILoggingInterceptor();
    }

    @Bean
    public HandlerInterceptor legacyInterceptor() {
        return new LegacyInterceptor();
    }
}
