package com.sangnv2008110181.tuan5;

public class TaiKhoan {
    String soDu;
    String soTaiKhoan;
    String tenTaiKhoan;
    String diaChi;
    String tenNganHang;
    String namSinh;
    String ngayCapThe;
    // hàm tạo mặc định
    TaiKhoan() {
        tenNganHang = "SacomBank";
    }
     // hàm tạo 1 tham số
    TaiKhoan(String ten) {
        tenTaiKhoan = ten;
    }
     // hàm tạo 2 tham số
    TaiKhoan(String nS, String dc) {
        namSinh = nS;
        diaChi = dc;
    }
     // hàm tạo 3 tham số
    TaiKhoan(String stk, String sD, String ngayCap) {
        soTaiKhoan = stk;
        soDu = sD;
        ngayCapThe = ngayCap;
    }
    
}
