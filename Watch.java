class Watch{

static String watch[]=new String[4];
		 
		 
public static void main(String a[]){

watch[0]="Titan";
watch[1]="Sonata";
watch[2]="Fastrack";
watch[3]="HMT";
getWatch();
		  
}
		  
public static void getWatch(){	
		 
for(int i=0 ; i < watch.length ; i++ ){
System.out.println(watch[i]);			 
}

}		 

}