package com.example.samuraitravel.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity

public class WebSecurityConfing {
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
	http
	.authorizeHttpRequests((requests)->requests
			.requestMatchers("/css/**","/images/**","/js/**","/storage/**","/").permitAll()
}
}
