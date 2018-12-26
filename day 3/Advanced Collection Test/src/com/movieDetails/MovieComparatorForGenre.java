package com.movieDetails;


import java.util.Comparator;

public class MovieComparatorForGenre implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails movie1, MovieDetails movie2) {
		return movie1.getGenre().compareTo(movie2.getGenre());
	}
}
