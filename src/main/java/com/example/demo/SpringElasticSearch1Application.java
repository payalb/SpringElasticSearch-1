package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.example.demo.dto.LocalDateStringConverter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;

@SpringBootApplication
public class SpringElasticSearch1Application{

	@Autowired LocalDateStringConverter converter;
	public static void main(String[] args) {
		SpringApplication.run(SpringElasticSearch1Application.class, args);
	}


/*	@Bean(name = "OBJECT_MAPPER_BEAN")
	public ObjectMapper jsonObjectMapper() {
	    return Jackson2ObjectMapperBuilder.json()
	            .serializationInclusion(JsonInclude.Include.NON_NULL) // Don’t include null values
	            .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) //ISODate
	            .modules(new JSR310Module())
	            .build();*/
//	}
	}
