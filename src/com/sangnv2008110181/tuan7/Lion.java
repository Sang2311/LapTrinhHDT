package com.sangnv2008110181.tuan7;

public class Lion extends Feline {
    public Lion (String picture, String food, int hunger){
        super (picture, food, hunger);

    }
    protected String picture = "hinh sư tử";
    protected String food = "ăn thịt";
    protected int hunger = 2;
    @Override
    protected void makeNoise (){
        System.out.println("kêu kiểu sư tử");
    }
    @Override
    protected void eat (){
        System.out.println("an kieu su tu");
    }
     void hunger (){
        System.out.println("sư tử ăn thịt");
    }
    
}
