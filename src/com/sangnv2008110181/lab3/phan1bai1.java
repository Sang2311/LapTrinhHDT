package com.sangnv2008110181.lab3;
import java.util.Scanner;
public class phan1bai1 {
    public static void main (String[] args){
    Scanner kiemTraSNT = new Scanner (System.in);
    System.out.println("Nhập vào một số dương: ");
    int soNguyen = kiemTraSNT .nextInt();
    Boolean ok = true;
    for (int i = 2; i < soNguyen - 1; i++){
        if (soNguyen % i ==0){
            System.out.println ("Đây không phải là số nguyên tố");
            ok = false;
            break;
        }
        i++;
        {
            System.out.println ("Đây là số nguyên tố");
            ok = true;
            break;

        }
    }

    }

}
