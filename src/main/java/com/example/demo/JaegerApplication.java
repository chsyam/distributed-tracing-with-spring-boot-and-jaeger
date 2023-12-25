package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.opentracing.contrib.spring.tracer.configuration.TracerAutoConfiguration;

@SpringBootApplication
public class JaegerApplication {
	public static void main(String[] args) {
		SpringApplication.run(JaegerApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
