class CameraUtil{

public static void main(String a[]){

Camera cam=new Camera();
cam.brand="Nikon";
cam.megaPixels=24.2f;
cam.price=75000;

System.out.println(cam.brand+"\n"+cam.megaPixels+"\n"+cam.price);
Camera.getCamera();

Camera cam1=new Camera();
cam1.brand="Canon";
cam1.megaPixels=50.6f;
cam1.price=40000;

System.out.println(cam1.brand+"\n"+cam1.megaPixels+"\n"+cam1.price);
Camera.getCamera();

Camera cam2=new Camera();
cam2.brand="Sony";
cam2.megaPixels=24.3f;
cam2.price=125000;

System.out.println(cam2.brand+"\n"+cam2.megaPixels+"\n"+cam2.price);
Camera.getCamera();

}



}