package com.xworkz.moviesapp.movie;

import java.util.Scanner;

import com.xworkz.moviesapp.dto.CastDTO;



public class MovieTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Movies");
		System.out.println("Enter the number of movies");
		int size=sc.nextInt();
		
		Movie movie=new Movie(size);
		
		for(int i=0;i<size;i++) {
			CastDTO cast=new  CastDTO();
			System.out.println("Enter cast id");
			cast.setCastId(sc.nextInt());
			
			System.out.println("Enter movie name ");
			cast.setMovName(sc.next());
			
			System.out.println("Enter hero name");
			cast.setHeroName(sc.next());
			
			
			boolean isCreated=movie.createMovies(cast);
			System.out.println(isCreated);
		}
		
		int choice;
		String text;
		do {
			System.out.println("press 1 to get movie Details");
			System.out.println("press 2 to get movie by id");
			System.out.println("press 3 to update movie name by id");
			System.out.println("press 4 to delete movie by id");
			System.out.println("enter the choice:");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				movie.getMovies();
				break;
			case 2:
				System.out.println("enter cast id");
				boolean id=movie.getMovieById(sc.nextInt());
				if(id!=false) {
					System.out.println(id);
					movie.getMovies();			}
				else {
					System.out.println("No movie found");
				}
				break;
			case 3:
				System.out.println("enter castid and movieName to update");
				boolean update=movie.updateMovieNameById(sc.nextInt(), sc.next());
				if(update!=false) {
					System.out.println(update);
					movie.getMovies();
				}
				else {
					System.out.println("No movie name is  updated");
				}
				break;
			case 4:
				System.out.println("enter cast id  to delete");
				boolean delete=movie.deleteMovieById(sc.nextInt());
				if(delete!=false) {
					System.out.println(delete);
					movie.getMovies();
				}
				else {
					System.out.println("No movie is deleted");
				}
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
		}while(text.equals("y"));
		System.out.println("than you for watching movie.....");
		
			
		}

}
