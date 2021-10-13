package com.sangnv2008110181.tuan4;

public class Customer {
    String name;
    int namSinh;
    String gioiTinh;
    Customer (String a, int b, String c)
    {
        name = a;
        namSinh = b;
        gioiTinh = c;
    }
    void getName () {
        System.out.println("Tên Khách Hàng: " + name );
        System.out.println("Quốc tịch: " + namSinh);
        System.out.println("Quê Quán: " + gioiTinh);
    }
    
}
