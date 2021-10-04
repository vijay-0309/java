class AppsUtil{

public static void main(String a[]){

Apps app=new Apps();
app.name="Phonepay";
app.purpose="Upi Payments";

Apps.getApp();
System.out.println(app.name+"\n"+app.purpose+"\n");


Apps app1=new Apps();
app1.name="Google";
app1.purpose="Browsing";

Apps.getApp();
System.out.println(app1.name+"\n"+app1.purpose+"\n");


Apps app2=new Apps();
app2.name="PUBG";
app2.purpose="Gaming";

Apps.getApp();
System.out.println(app2.name+"\n"+app2.purpose+"\n");
}


}