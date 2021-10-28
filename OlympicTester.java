package com.xworkz.olympicapp.olympic;

import java.util.Scanner;

import com.xworkz.olympicapp.dto.GamesDTO;


public class OlympicTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to olympics");
		System.out.println("Enter the number of games");
		int size=sc.nextInt();
		
		Olympic oly=new Olympic(size);
		
		for(int i=0;i<size;i++) {
			GamesDTO game=new GamesDTO();
			System.out.println("Enter game id");
			game.setId(sc.nextInt());
			
			System.out.println("Enter game name ");
			game.setName(sc.next());
			
			System.out.println("Enter game type");
			game.setType(sc.next());
			
			
			boolean isCreated=oly.createGames(game);
			System.out.println(isCreated);
		}
		
		int choice;
		String text;
		do {
			System.out.println("press 1 to get game Details");
			System.out.println("press 2 to get game by id");
			System.out.println("press 3 to update game name by id");
			System.out.println("press 4 to delete game by id");
			System.out.println("enter the choice:");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				oly.getGames();
				break;
			case 2:
				System.out.println("enter game id");
				boolean id=oly.getGameById(sc.nextInt());
				if(id!=false) {
					System.out.println(id);
					oly.getGames();				}
				else {
					System.out.println("No game found");
				}
				break;
			case 3:
				System.out.println("enter id and gamename to update");
				boolean update=oly.updateGameNameById(sc.nextInt(), sc.next());
				if(update!=false) {
					System.out.println(update);
					oly.getGames();
				}
				else {
					System.out.println("No name is  updated");
				}
				break;
			case 4:
				System.out.println("enter game id  to delete");
				boolean delete=oly.deleteGameById(sc.nextInt());
				if(delete!=false) {
					System.out.println(delete);
					oly.getGames();
				}
				else {
					System.out.println("No game is deleted");
				}
				break;
			default:
				System.out.println("Enter valid choice");
			}
			System.out.println("if you want to continue?? press y or n");
			text=sc.next();
		}while(text.equals("y"));
		System.out.println("thank you for coming to 2021 olympics .....");
		
			
		}
}
