package com.sangnv2008110181.tuan5;

public class Cow {
    // attribute
    double weight;
    double age;
    Cow (){
        weight = 15;
        age = 1;
    }
    // hàm tạo 1 tham số
    Cow (double w){
        weight = w;
        age = 2;
    }
    // hàm tạo 2 tham số
    Cow (double w, double a){
        weight = w;
        age = a;
    }
    void inThongTin (){
        System.out.print("Cân Nặng :" + weight);
        System.out.println(" kg");
        System.out.print("Tuổi: "+age);
        System.out.println(" tuổi");
    }
    void moo(){
        System.out.println("Be be be");
    }
    
}
