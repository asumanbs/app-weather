package com.example.weather;

import com.example.weather.kafka.Publisher;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.Clock;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}
	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new ParameterNamesModule());
		objectMapper.registerModule(new JavaTimeModule());
		return objectMapper;
	}

	@Bean
	public Clock clock() {
		return Clock.systemDefaultZone();
	}
	@Bean
	public ApplicationRunner runner(Publisher p){
		return args -> {
			p.sendMessage("Hellooooo KAFKAAAA");
		};

	}

}
