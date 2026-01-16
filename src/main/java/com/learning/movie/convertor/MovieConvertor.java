package com.learning.movie.convertor;

import com.learning.movie.entities.Movie;
import com.learning.movie.request.MovieRequest;

public class MovieConvertor {

    public static Movie movieDtoToMovie(MovieRequest movieRequest) {

        return Movie.builder()
                .movieName(movieRequest.getMovieName())
                .duration(movieRequest.getDuration())
                .genre(movieRequest.getGenre())
                .language(movieRequest.getLanguage())
                .releaseDate(movieRequest.getReleaseDate())
                .rating(movieRequest.getRating())
                .build();
    }
}
