package com.sangnv2008110181.kiemtragiuaki;

public class NhanVien extends Nguoi {
    private float heSoLuong;
    protected float tinhLuong(){
        return heSoLuong*1500000;
    }
    @Override
    public String toString() {
        return super.toString() +" "+ tinhLuong() + " VND";
    }
    NhanVien(String hoTen,String diaChi,float heSoLuong){
        super(hoTen,diaChi);
        this.heSoLuong = heSoLuong;
    }
}
    

