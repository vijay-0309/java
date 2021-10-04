class AbusementParkUtil{

public static void main(String a[]){

AbusementPark park=new AbusementPark();
park.name="Wonderla";
park.place="Bangalore";
park.entryFees=750;

AbusementPark.getData();
System.out.println(park.name+"\n"+park.place+"\n"+park.entryFees+"\n");

AbusementPark park1=new AbusementPark();
park1.name="GRS";
park1.place="Mysore";
park1.entryFees=900;

AbusementPark.getData();
System.out.println(park1.name+"\n"+park1.place+"\n"+park1.entryFees+"\n");

AbusementPark park2=new AbusementPark();
park2.name="Ramoji Film City";
park2.place="Hydrabad";
park2.entryFees=1500;

AbusementPark.getData();
System.out.println(park2.name+"\n"+park2.place+"\n"+park2.entryFees+"\n");

}


}