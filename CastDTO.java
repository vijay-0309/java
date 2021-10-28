package com.xworkz.moviesapp.dto;

public class CastDTO {
	private int castId;
	private String movName;
	private String heroName;
	public int getCastId() {
		return castId;
	}
	public void setCastId(int castId) {
		this.castId = castId;
	}
	public String getMovName() {
		return movName;
	}
	public void setMovName(String movName) {
		this.movName = movName;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	@Override
	public String toString() {
		return "CastDTO [castId=" + castId + ", movName=" + movName + ", heroName=" + heroName + "]";
	}
	
	

}
