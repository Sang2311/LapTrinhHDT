package com.sangnv2008110181.tuan7;

public class Animal {
    private String picture;
    private String food;
    protected int hunger;
    private String boundaries;
     private int location;
     public Animal (String picture, String food, int hunger )
     {
        this.picture = picture;
         this.food = food;
         this.hunger = hunger;
     }
     public String getPicture(){
         return picture;

     }
     
     public String getFood (){
         return food;
     }
     public int getHunger (){
         return hunger;
     }
     protected void makeNoise (){
         System.out.println ("a.a.a.aaaaaa");
     }
     protected void eat (){
        System.out.println ("Ăn bình thường");
     }
     protected void sleep (){
        System.out.println ("Đang ngủ");
     }
     protected void roam (){
        System.out.println ("Đi dao");
     }
    }
    

