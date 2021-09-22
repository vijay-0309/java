class CountryNames{

static String[] countryName = new String[7];

public static void main(String a[]){
     

 countryName[0]="India";
 countryName[1]="Sri lanka";
 countryName[2]="England";
 countryName[3]="South Africa";
 countryName[4]="USA";
 countryName[5]="Pakistan";
 countryName[6]="China";
 getCountryName();

}
public static void getCountryName(){
 System.out.println(countryName.length);
 for(int i=0;i<countryName.length;i++){
 System.out.print(countryName[i]+"  ");
}
}
}
