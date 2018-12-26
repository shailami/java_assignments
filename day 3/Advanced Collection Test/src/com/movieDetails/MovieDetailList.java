package com.movieDetails;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MovieDetailList {
	private List<MovieDetails> list = new ArrayList<MovieDetails>();
	Iterator<MovieDetails> iterator = list.iterator();

	public void add_movie(String movieName, String leadActor,
			String leadActress, String genre) {
		list.add(new MovieDetails(movieName, leadActor, leadActress, genre));
	}

	public void remove_movie(String movieName) {
		list.remove(movieName);
	}

	public void remove_AllMovies() {
		list.removeAll(list);
	}

	public MovieDetails find_movie_By_mov_Name(String movieName) {
		while (iterator.hasNext()) {
			if (iterator.next().getMovieName().equalsIgnoreCase(movieName))
				return iterator.next();
		}
		return null;
	}

	public MovieDetails find_movie_By_Genre(String genre) {
		while (iterator.hasNext()) {
			if (iterator.next().getGenre().equalsIgnoreCase(genre))
				return iterator.next();
		}
		return null;
	}

	public void sortOnBasisOfArgument(String argument) {
		switch (argument) {
		case "movieName":
			Collections.sort(list, new MovieComparatorChaining(
					new MovieComparatorForMovieName()));
			break;
		case "leadActress":
			Collections.sort(list, new MovieComparatorChaining(
					new MovieComparatorForLeadActress()));
			break;
		case "leadActor":
			Collections.sort(list, new MovieComparatorChaining(
					new MovieComparatorForLeadActor()));
			break;
		case "genre":
			Collections.sort(list, new MovieComparatorChaining(
					new MovieComparatorForGenre()));
			break;
		}

	}

	@Override
	public String toString() {
		return "MovieDetailList [list=" + list + "]";
	}

}
