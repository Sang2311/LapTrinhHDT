package com.sangnv2008110181.tuan5;

public class Xe {
    String tenChuXe;
    String hangSanXuat;
    String dongXe;
    String giayPhep;
    int dungTichXang;
    String xuatXu;
    Xe() {
        System.out.println("Xe Yamaha");
    }
    Xe(String hSx){
        hangSanXuat=hSx;
    }
    Xe(String tCX, String dX){
        tenChuXe=tCX;
        dongXe=dX;
    }
    Xe(String xX,String dX, String gP){
        xuatXu=xX;
        dongXe=dX;
        giayPhep=gP;
    }
    
}
