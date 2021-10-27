package com.sangnv2008110181.tuan6;

public class Square {
    boolean nhapChuot;
    String amThanh;
    public static int soLanNhapChuot;
    void xoay (){
        System.out.println ("Xoay 360 độ theo chiều kim đông hồ");
    }
    void phatRaAmThanh (){
        System.out.println ("rang rang");
    }
    Square(boolean n, String s){
        nhapChuot = n ;
        amThanh = s;
        soLanNhapChuot++;
    }
    
}
