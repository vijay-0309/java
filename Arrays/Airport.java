class Airport{

static String[] internationalAirports={"Kempegowda International Airport","Mangalore International Airport"};
static String[] domesticAirports={"Belgaum Airport","Bellary Airport","Mysore Airport","Hubli Airport"};

public static void main(String a[]){

getinternationalAirports();
getdomesticAirports();
}

public static String[] getinternationalAirports(){

for(int i=0;i<internationalAirports.length;i++){
System.out.println(internationalAirports[i]);
}
return internationalAirports;
}


public static String[] getdomesticAirports(){

for(int j=0;j<domesticAirports.length;j++){
System.out.println(domesticAirports[j]);
}
return domesticAirports;
}
}