package com.movieDetails;


import java.util.Comparator;

public class MovieComparatorForLeadActress implements Comparator<MovieDetails> {


	@Override
	public int compare(MovieDetails movie1, MovieDetails movie2) {
		return movie1.getLeadActress().compareTo(movie2.getLeadActress());
	}

}
