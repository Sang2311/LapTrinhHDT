package com.sangnv2008110181.tuan6;

public class TriangleTestDrive {
    public static void main(String[] args) {
        Triangle triangle = new Triangle (true , "hinhtamgiac.aif");
        System.out.println("Hình có được nhấp chuột: "+triangle.nhapChuot);
    
        System.out.println("Số lần nhấp chuột: "+triangle.soLanNhapChuot);

        triangle.xoay();

        System.out.println("Âm thanh phát ra khi được nhấp chuột vào: "+triangle.amThanh);

        triangle.phatRaAmThanh();
    
    }
    
}
