package com.learning.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.movie.convertor.MovieConvertor;
import com.learning.movie.entities.Movie;
import com.learning.movie.exceptions.MovieAlreadyExist;
import com.learning.movie.repositories.MovieRepository;
import com.learning.movie.request.MovieRequest;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public String addMovie(MovieRequest movieRequest) {
		Movie movieByName = movieRepository.findByMovieName(movieRequest.getMovieName());
		
		if (movieByName != null && movieByName.getLanguage().equals(movieRequest.getLanguage())) {
			throw new MovieAlreadyExist();
		}
		
		Movie movie = MovieConvertor.movieDtoToMovie(movieRequest);
		
		movieRepository.save(movie);
		return "The movie has been added successfully";
	}

}
