package com.sangnv2008110181.tuan5;

public class NhanVien {
    String tenNhanVien;
    String tienLuong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;
   NhanVien(){
    diaChi="523 - Sa Đéc";
}
    NhanVien(String bplv){
    boPhanLamViec=bplv;
}
    NhanVien(String tnv, String ns){
    tenNhanVien=tnv;
    ngaySinh=ns;
}
     NhanVien(String tnv, String tl, String bplv){
    tenNhanVien=tnv;
    tienLuong = tl;
    boPhanLamViec=bplv;

}
    
}
