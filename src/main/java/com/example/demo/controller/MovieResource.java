package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Movie;
import com.example.demo.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@Autowired
	MovieService service;

	@PostMapping(path = "/movie", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addMovie(@RequestBody Movie movie) {
		service.addMovie(movie);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Movie> getMovies() {
		return 	service.getMovies();
	}

}
