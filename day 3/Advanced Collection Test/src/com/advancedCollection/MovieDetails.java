package com.advancedCollection;

public class MovieDetails {
	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;
	
	protected MovieDetails(String movieName, String leadActor,
			String leadActress, String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActress=" + leadActress + ", genre="
				+ genre + "]";
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getLeadActress() {
		return leadActress;
	}
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
