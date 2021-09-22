class ExamMethodOverloading{

public static String universityName="VTU";
public static String[] hallTicket;
public static int fees=1350;

public static void allow(String[] hallTicket)
{
if (hallTicket!=null){
  getHallTicket(hallTicket);
  System.out.println("valid for writing exam");  
  }
else{
   System.out.println("No HallTicket");
  }
}

public static void allow(int fees)
{
if (fees >1000){
  System.out.println(fees);  
  }
else{
   System.out.println("Abey saale...frst hogi fees kattu");
  }


}

public static void getHallTicket(String[] hallTicket){

for(int i=0;i<hallTicket.length;i++){
   
	System.out.println(hallTicket[i]);
}
}
}