package com.learning.movie.request;

import lombok.Data;

import java.sql.Date;

import com.learning.movie.enums.Genre;
import com.learning.movie.enums.Language;

@Data
public class MovieRequest {
	private String movieName;
	private Integer duration;
	private Double rating;
	private Date releaseDate;
	private Genre genre;
	private Language language;
}
