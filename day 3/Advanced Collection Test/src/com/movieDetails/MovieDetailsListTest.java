package com.movieDetails;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MovieDetailsListTest {
	private MovieDetails movieDetails1;
	private MovieDetailList movieDetailList;
	MovieDetailList movielist = new MovieDetailList();

	@Before
	public void setUp() {

		movielist.add_movie("A", "U", "Y", "D");
		movielist.add_movie("B", "W", "X", "E");
		movielist.add_movie("C", "V", "Z", "F");
		// System.out.println(movielist.toString());

	}

	@Test
	public void movieListSortByMovieNameTest() {
		movielist.sortOnBasisOfArgument("movieName");
		System.out.println(movielist.toString());
	}

	@Test
	public void movieListSortByLeadActressTest() {
		movielist.sortOnBasisOfArgument("leadActress");
		System.out.println(movielist.toString());
	}

	@Test
	public void movieListSortByLeadActorTest() {
		movielist.sortOnBasisOfArgument("leadActor");
		System.out.println(movielist.toString());
	}

	@Test
	public void movieListSortByGenreTest() {
		movielist.sortOnBasisOfArgument("genre");
		System.out.println(movielist.toString());
	}

}
