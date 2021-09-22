class Speaker{

 static String name="Boat";
 static int minVolume=0;
 static int maxVolume=10;
 static boolean isConnected=false;
 static int currentVolume;


public static boolean onOrOff(){
 if(isConnected ==false){
  isConnected=true;
  return isConnected;
  }
 else {
  return false;
  }
}

public static void increaseVolume(){
System.out.println("increseVolume method start");
if(isConnected){
  if(currentVolume < maxVolume){
     currentVolume=currentVolume+1;
     System.out.println("current volume is :"+ currentVolume) ;
   }
  else{
    System.out.println("Max Volume Reached"); 
    }
} 
else{
System.out.println("hoi frst speaker on maadu"); 
 }

System.out.println("increseVolume method end");
}

public static void decreaseVolume(){
System.out.println("decreseVolume method start");
if(isConnected){
  if( currentVolume > minVolume){   /*or we can use currentVolume<=maxVolume && currentVolume !=0 */
     currentVolume=currentVolume-1;
     System.out.println("current volume is :"+ currentVolume) ;
   }
  else{
    System.out.println("Min Volume Reached"); 
    }
} 
else{
System.out.println("hoi frst speaker on maadu"); 
 }

System.out.println("decreseVolume method end");
}

} 