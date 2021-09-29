package com.sangnv2008110181.lab1;
import java.util.Scanner;
public class phan1bai2 {
    public static void main(String[] args) {
        int canhA, canhB, canhNhoNhat;
        double chuVi, dienTich;
        Scanner tinhToan;

        tinhToan = new Scanner(System.in);
        System.out.print("Nhập hai cạnh: ");
        canhA = tinhToan.nextInt();
        canhB = tinhToan.nextInt();
        chuVi = (canhA + canhB) * 2;
        dienTich = canhA * canhB;
        canhNhoNhat = Math.min(canhA,canhB);
        System.out.println("Chu vi la: " + chuVi);
        System.out.println("Dien tich la: " + dienTich);
        System.out.println("Canh nho nhat la: " + canhNhoNhat);
        tinhToan.close();
        
    }
    
}
