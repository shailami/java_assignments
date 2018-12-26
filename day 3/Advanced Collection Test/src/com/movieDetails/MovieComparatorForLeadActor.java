package com.movieDetails;


import java.util.Comparator;

public class MovieComparatorForLeadActor implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails movie1, MovieDetails movie2) {
		return movie1.getLeadActor().compareTo(movie2.getLeadActor());
	}

}
