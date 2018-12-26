package com.movieDetails;


import java.util.Comparator;

public class MovieComparatorForMovieName implements Comparator<MovieDetails>
{
	@Override
	public int compare(MovieDetails movie1, MovieDetails movie2) {
 		return movie1.getMovieName().compareTo(movie2.getMovieName());
	}

}

