package com.sangnv2008110181.tuan7;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion ("hình sư tử","ăn thịt",2);
        lion.makeNoise();
        lion.eat();
        lion.roam();

        
       Lion lion2 = new Lion("hình sư tử","ăn thịt", 2);

        System.out.println("hình của sư tử :" + lion2.getPicture());

    }

}
