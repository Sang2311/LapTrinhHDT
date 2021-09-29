package com.sangnv2008110181.lab3;
import java.util.Scanner;
public class bai2 {
    public static void main (String[] args) {
        System.out.println("===Bảng Cửu Chương===");
        for (int i = 1; i <= 10;i++){
            System.out.println ("bảng cửu chương" +i);
            for (int j = 1; j <= 10; j++){
                System.out.printf ("%d x %d = %d/n", +i, +j, j * i);
            }
            System.out.println ();

        }

    }

    
}
