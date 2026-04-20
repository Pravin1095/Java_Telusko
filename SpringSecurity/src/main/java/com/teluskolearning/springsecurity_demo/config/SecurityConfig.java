package com.teluskolearning.springsecurity_demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //Tells Spring, "This class contains bean definitions (instructions) that you need to load before the app starts."
@EnableWebSecurity  //@EnableWebSecurity: This is a specialized switch. It tells Spring to ignore the default security settings and use the rules defined in this class instead.
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) {
        return http.build();
    }
}
   // HttpSecurity http: This object is like a "Security Rules Builder." It has dozens of methods to configure CSRF, CORS, Authentication, and Authorization.

    //The Return Value: You are returning a SecurityFilterChain. Spring takes this object and places it at the very front of your application. Every single web request must pass through this "chain" of filters before reaching your Controllers.

