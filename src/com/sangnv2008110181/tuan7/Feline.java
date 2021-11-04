package com.sangnv2008110181.tuan7;

public class Feline extends Animal {
    public Feline ( String picture, String food, int hunger){
        super (picture, food, hunger);
    }
    protected void roam (){
        System.out.println(" đi một mình");
    }
    
}
