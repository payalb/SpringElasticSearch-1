package com.example.demo.dto;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import lombok.Data;
@Data
@Document(indexName="my_movies", type="movie")
public class Movie {

	@Id
	int id;
	String name;
	String category;
	int rating;
	  @JsonDeserialize(using = LocalDateDeserializer.class)
	    @JsonSerialize(using = LocalDateSerializer.class)
	LocalDate date;
	int actor_count;
	String description;
	
}
