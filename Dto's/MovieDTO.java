package com.xworkz.CollectionAndFrameworks.Dto;

public class MovieDTO {
	private String movieName;
	private String heroName;
	private String heroineName;
	public MovieDTO(String movieName,String heroName,String heroineName) {
		this.heroineName=heroineName;
		this.heroName=heroName;
		this.movieName=movieName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroineName() {
		return heroineName;
	}
	public void setHeroineName(String heroineName) {
		this.heroineName = heroineName;
	}
	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", heroName=" + heroName + ", heroineName=" + heroineName + "]";
	}
	

}
