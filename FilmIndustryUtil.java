class FilmIndustryUtil{

public static void main(String a[]){

FilmIndustry industry=new FilmIndustry();
industry.language="Kannada";
industry.nameOfIndustry="SandalWood";
industry.famousActor="Dasrshan";
industry.famousActres="Radhika Pandith";

FilmIndustry.getIndustry();
System.out.println(industry.language+"\n"+industry.nameOfIndustry+"\n"+industry.famousActor+"\n"+industry.famousActres+"\n");


FilmIndustry industry1=new FilmIndustry();
industry1.language="Hindhi";
industry1.nameOfIndustry="BolyWood";
industry1.famousActor="Varun Dhavan";
industry1.famousActres="Aliya Bhat";

FilmIndustry.getIndustry();
System.out.println(industry1.language+"\n"+industry1.nameOfIndustry+"\n"+industry1.famousActor+"\n"+industry1.famousActres+"\n");

FilmIndustry industry2=new FilmIndustry();
industry2.language="Tamil";
industry2.nameOfIndustry="TolyWood";
industry2.famousActor="Thalapathy Vijay";
industry2.famousActres="Sayi pallavi";

FilmIndustry.getIndustry();
System.out.println(industry2.language+"\n"+industry2.nameOfIndustry+"\n"+industry2.famousActor+"\n"+industry2.famousActres+"\n");

}


}