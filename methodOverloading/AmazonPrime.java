class AmazonPrime{

static String movies[]={"Shershah","Cindrella","RaktaCharita","JanakiRamulo","Robert","KGF"};
static String series[]={"Mirzapur","The Family Man","Vampire Dairies"};

static String movie="Dia";
static String series1="Hostel Daze";


public static void main(String a[]){

System.out.println("main method started");
getMovies(movies);
String mov=getMovies(movie);
System.out.println(mov);
getSeries(series);
String ser=getSeries(series1);
System.out.println(ser);
}

public static void getMovies(String[] movies){
System.out.println("inside getMovies method with string array parameters");
for(int i=0;i<movies.length;i++){
 System.out.println(movies[i]);
}
}

public static String getMovies(String movie){
System.out.println("movie name print started");
System.out.println("movie name print ended");
return movie;
}

public static void getSeries(String[] series){
System.out.println("inside getSeries method with string array parameters");
for(int j=0;j<series.length;j++){
 System.out.println(series[j]);
}
}

public static String getSeries(String series1){
System.out.println("series name print started");
System.out.println("series name print ended");
return series1;
}
}