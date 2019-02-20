package com.example.demo.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import com.example.demo.dto.Movie;

public interface MovieRepository extends ElasticsearchCrudRepository<Movie, Integer>{

	List<Movie> findByDescriptionContaining(String keyword);
}
