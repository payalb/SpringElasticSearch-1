package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Movie;
import com.example.demo.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository rep;

	public void addMovie(Movie movie) {
		rep.save(movie);
	}
	
	public Iterable<Movie> getMovies() {
		return rep.findAll();
	}
}
