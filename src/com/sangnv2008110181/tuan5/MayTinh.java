package com.sangnv2008110181.tuan5;

public class MayTinh {
    String tenNhaSanXuat;
    String namSanXuat;
    String heDieuHanh;
    String ram;
    String cpu;
    String gia;
    String namBaoHanh;
    // hàm tạo mặc định
    MayTinh (){
        namBaoHanh = "2 năm";
    }
    // hàm tạo 1 tham số
    MayTinh(String g) {
        gia = g;
    }
    // hàm tạo 2 tham số
    MayTinh(String nsx, String n) {
        tenNhaSanXuat = nsx;
        namSanXuat = n;

    }
    // hàm tạo 3 tham số
    MayTinh(String hdh, String c, String r) {
        heDieuHanh = hdh;
        cpu = c;
        ram = r;
    }
    
}
