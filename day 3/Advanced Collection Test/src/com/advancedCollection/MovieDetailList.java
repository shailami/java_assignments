package com.advancedCollection;

import java.util.ArrayList;
import java.util.List;

public class MovieDetailList {
	private List<MovieDetails> list = new ArrayList<MovieDetails>();

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

	public void find_movie_By_mov_Name() {
		list.g
	}

	public void find_movie_By_Genre() {

	}

	public void Sort(MovieDetails argument) {

	}

}
