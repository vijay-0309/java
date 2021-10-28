package com.xworkz.olympicapp.olympic;

import com.xworkz.olympicapp.dto.GamesDTO;

public class Olympic {
public GamesDTO[] games;
	
	int index;
	private static int s=0;
	
	public Olympic(int size) {
		games =new GamesDTO[size];
	}
	
	//create operation:
	public boolean createGames(GamesDTO games) {
		boolean isCreated=false;
		System.out.println("inside create games");
		if(games!=null) {
			this.games[index++]=games;
			isCreated=true;
		}
		else {
			System.out.println("No games are created");
			return isCreated;
		}
		return isCreated;
	}
	
	public void getGames() {
		for(int i=0;i<games.length-s;i++) {
			System.out.println(games[i]);
		}
	}
	
	//get operation:
	public boolean getGameById(int id) {
		boolean f=false;
		GamesDTO game=null;
		if(games!=null) {
			for(int i=0;i<games.length;i++){
				if(games[i]!=null) {
				if(games[i].getId()==id){
					System.out.println("game found by id:"+id);
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
			System.out.println("No game found");
		}
		return f;
	}
	
	
	
	//update operation:
	public boolean updateGameNameById(int id,String name) {
		boolean update=false;
		GamesDTO game=null;
		System.out.println("inside update method");
		if(id>0 && name!=null ) {
			for(int i=0;i<games.length;i++) {
				if(games[i].getId()==id) {
					System.out.println("game name updated by id:"+id);
					games[i].setName(name);
					update=true;
					break;
				}
				else {
					update=false;
				}
			}
		}
		if(update==false) {
			System.out.println("game name is not updated");
		}
		return update;
	}
	
	//delete operation:
	public boolean deleteGameById(int gid) {
		boolean delete=false;
		int id=0;
		GamesDTO game=null;
		System.out.println("inside delete operation");
		if(gid>0) {
			for(int i=0;i<games.length;i++) {
				if(games[i].getId()==gid) {
					System.out.println("game deleted by id:"+gid);
					id=i;
					s=s+1;
					delete=true;
					break;
				}
				
				else {
					delete=false;
					System.out.println("No patient deleted");
				}
			}
			if(games.length==1) {
				games[0]=null;
			}
			else {
				for(int i=id;i<games.length-1;i++) {
					games[i]=games[i+1];
				}
			}
		}
		return delete;
	}



}
