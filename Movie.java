package com.xworkz.moviesapp.movie;

import com.xworkz.moviesapp.dto.CastDTO;

public class Movie {
public CastDTO[] cast;
	
	int index;
	private static int s=0;
	
	public Movie(int size) {
		cast=new CastDTO[size];
	}
	
	//create operation:
	public boolean createMovies(CastDTO cast) {
		boolean isCreated=false;
		System.out.println("inside create Movies");
		if(cast!=null) {
			this.cast[index++]=cast;
			isCreated=true;
		}
		else {
			System.out.println("No games are created");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getMovies() {
		for(int i=0;i<cast.length-s;i++) {
			System.out.println(cast[i]);
		}
	}
	
	//get operation:
	public boolean getMovieById(int id) {
		boolean f=false;
		CastDTO casts=null;
		if(cast!=null) {
			for(int i=0;i<cast.length;i++){
				if(cast[i]!=null) {
				if(cast[i].getCastId()==id){
					System.out.println("movie found by id:"+id);
					f=true;
					break;
				}
				}
				else {
					f=false;
				}
			}
		}
		if(f==false) {
			System.out.println("No movie found");
		}
		return f;
	}
	
	
	
	//update operation:
	public boolean updateMovieNameById(int id,String movName) {
		boolean update=false;
		CastDTO casts=null;
		System.out.println("inside update method");
		if(id>0 && movName!=null ) {
			for(int i=0;i<cast.length;i++) {
				if(cast[i].getCastId()==id) {
					System.out.println("movie  name updated by id:"+id);
					cast[i].setMovName(movName);
					update=true;
					break;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("movie name is not updated");
		}
		return update;
	}
	
	//delete operation:
	public boolean deleteMovieById(int mid) {
		boolean delete=false;
		int id=0;
		CastDTO casts=null;
		System.out.println("inside delete operation");
		if(mid>0) {
			for(int i=0;i<cast.length;i++) {
				if(cast[i].getCastId()==mid) {
					System.out.println("movie deleted by id:"+mid);
					id=i;
					s=s+1;
					delete=true;
					break;
				}
				
				else {
					delete=false;
					System.out.println("No movie deleted");
				}
			}
			if(cast.length==1) {
				cast[0]=null;
			}
			else {
				for(int i=id;i<cast.length-1;i++) {
					cast[i]=cast[i+1];
				}
			}
		}
		return delete;
	}


}
