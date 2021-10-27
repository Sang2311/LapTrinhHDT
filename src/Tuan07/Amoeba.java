package Tuan07;

public class Amoeba {
    String sound;
    int x;
    int y;
    Amoeba(){}
   public Amoeba (String s){
     //sound = s;
   }
   public Amoeba (String s, int xx, int yy){
    //sound = s;
    x = xx;
    y = yy;
   }
   public void rotate(){
       System.out.println("Xoay theo toạ độ x = " + x +" và y =");
   }
   public void playsound(){
       //System.out.println("Phát ra file âm thanh có tên" + sound);
   }
}
