package com.example.interceptor1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}

@RestController
@RequestMapping("/")
class BasicController {

    @GetMapping("/time")
    public String getCurrentTime() {
        return "Current date/time: " + java.time.LocalDateTime.now();
    }
}

@RestController
@RequestMapping("/")
class LegacyController {

    @GetMapping("/legacy")
    public String getLegacyData() {
        return "This is just old code";
    }
}

@Configuration
class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new APILoggingInterceptor());
        registry.addInterceptor(new LegacyInterceptor());
    }
}

class APILoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("User-Agent: " + request.getHeader("User-Agent"));
        return true;
    }
}

class LegacyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request


@RestController
@RequestMapping("/")
class BasicController {

    @GetMapping("/time")
    public String getCurrentTime() {
        return "Current date/time: " + java.time.LocalDateTime.now();
    }
}

@RestController
@RequestMapping("/")
class LegacyController {

    @GetMapping("/legacy")
    public String getLegacyData() {
        return "This is just old code";
    }
}

@Configuration
class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new APILoggingInterceptor());
        registry.addInterceptor(new LegacyInterceptor());
    }
}

class APILoggingInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("User-Agent: " + request.getHeader("User-Agent"));
        return true;
    }
}

class LegacyInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().equals("/legacy")) {
            response.setStatus(HttpServletResponse.SC_GONE);
            return false;
        }
        return true;
    }
}
