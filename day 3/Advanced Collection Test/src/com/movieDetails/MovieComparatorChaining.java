package com.movieDetails;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MovieComparatorChaining implements Comparator<MovieDetails> {


    private List<Comparator<MovieDetails>> listComparators;
 
    @SafeVarargs
    public MovieComparatorChaining(Comparator<MovieDetails>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
 
    @Override
    public int compare(MovieDetails movie1, MovieDetails movie2) {
        for (Comparator<MovieDetails> comparator : listComparators) {
            int result = comparator.compare(movie1, movie2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
	 

}
