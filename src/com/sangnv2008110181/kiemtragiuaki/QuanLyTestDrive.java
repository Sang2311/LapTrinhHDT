package com.sangnv2008110181.kiemtragiuaki;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        
    
        DanhSachQuanLy list = new DanhSachQuanLy();
        HocVien hocVien = new HocVien("Nguyễn Văn Sang","523", 6,7);
        NhanVien nhanVien = new NhanVien("Nguyễn Văn Tèo", "22/8", 900);
        KhachHang khachHang = new KhachHang("Nguyễn Văn Hên", "287", "abc", 5000000);
        list.themNguoi(hocVien);
        list.themNguoi(nhanVien);
        list.themNguoi(khachHang);
        list.inList();
    
}
}
