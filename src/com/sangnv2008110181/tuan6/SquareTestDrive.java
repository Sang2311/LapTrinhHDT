package com.sangnv2008110181.tuan6;

public class SquareTestDrive {
    public static void main(String[] args) {
        Square square = new Square (true , "hinhvuong.aif");
        System.out.println("Hình có được nhấp chuột: "+square.nhapChuot);
    
            System.out.println("Số lần nhấp chuột: "+square.soLanNhapChuot);
    
            square.xoay();
    
            System.out.println("Âm thanh phát ra khi được nhấp chuột vào: "+square.amThanh);
    
            square.phatRaAmThanh();
        
    }
    
}
