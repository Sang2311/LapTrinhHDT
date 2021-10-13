package com.sangnv2008110181.tuan5;

public class Sach {
    String tenSach;
    String giaTien;
    String tenNhaSX;
    int namXB;
    String soLuong;
    String loai;
    // hàm tạo mặc định
    Sach() {
        tenNhaSX = "Sách Giao Khoa";
    }
    // ham tạo 1 tham số
    Sach(int nXB) {
        namXB = nXB;
    }
    // hàm tạo 2 tham số
    Sach(String tS, String gT) {
        tenSach = tS;
        giaTien = gT;

    }
    // hàm tạo 3 tham số
    Sach(String tS, String sl, String l) {
        tenSach = tS;
        soLuong = sl;
        loai = l;

    }
    void showThongTin() {
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tên nhà xuất bản: " + tenNhaSX);
        System.out.println("Giá tiền: " + giaTien);
    }
    
}
