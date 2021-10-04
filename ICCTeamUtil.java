class ICCTeamUtil{

public static void main(String a[]){

ICCTeam team =new ICCTeam();
team.nameOfTeam="India";
team.noOfPlayers=11;
team.noOfBatsman=6;
team.noOfBowlers=5;

ICCTeam.getDetails();
System.out.println(team.nameOfTeam+"\n"+team.noOfPlayers+"\n"+team.noOfBatsman+"\n"+team.noOfBowlers);	

ICCTeam team1 =new ICCTeam();
team1.nameOfTeam="Pakistan";
team1.noOfPlayers=11;
team1.noOfBatsman=5;
team1.noOfBowlers=6;

ICCTeam.getDetails();
System.out.println(team1.nameOfTeam+"\n"+team1.noOfPlayers+"\n"+team1.noOfBatsman+"\n"+team1.noOfBowlers);


ICCTeam team2 =new ICCTeam();
team2.nameOfTeam="SouthAfrica";
team2.noOfPlayers=11;
team2.noOfBatsman=7;
team2.noOfBowlers=4;

ICCTeam.getDetails();
System.out.println(team2.nameOfTeam+"\n"+team2.noOfPlayers+"\n"+team2.noOfBatsman+"\n"+team2.noOfBowlers);
}


}