class Exam{

public static String universityName="VTU";
public static String[] hallTicket={"Ramdev Baba","PA06AY026","Home Products"};
public static int fees=1350;

public static boolean allow(String[] hallTicket)
{
boolean allowedToWriteExam=false;

if(fees>1100)
{
 if(hallTicket != null)
{
allowedToWriteExam=true;
getHallTicket(hallTicket);
return allowedToWriteExam;
}
 else{
 System.out.println("No HallTicket!!! cannot allow to Write Exam");
}

}
else{
 System.out.println("tata ByeBye....please pay the fees");
}
return allowedToWriteExam;
}

public static void getHallTicket(String[] hallTicket){

for(int i=0;i<hallTicket.length;i++){
   
	System.out.println(hallTicket[i]);
}
}
}