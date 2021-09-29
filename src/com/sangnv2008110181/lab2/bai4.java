package com.sangnv2008110181.lab2;
import java.util.Scanner;
public class bai4 {
    public static void main (String[] args){
    int num = 0;
   do {
        System.out.println ("=====MENU=====");
        System.out.println ("1. Giai phuong trinh bac 1");
        System.out.println ("2. Giai phuong trinh bac 2");
        System.out.println ("3. Tinh tien dien");
        System.out.println ("4. Thoat ");
       System.out.print ("Chon dich vu: ");
       Scanner menu = new Scanner(System.in);
       num = menu.nextInt();
        switch (num){
            case 1 : System.out.println("Giai phuong trinh bac 1: ");
            giaiPTBac1();
            break;
            case 2 : System.out.println("Giai phuong tinh bac 2: ");
            giaiPTBac2();
            break;
            case 3 : System.out.println("Tinh tien dien: ");
            tinhTienDien ();
            break;
            default : System.out.println ("Chon lai: "); break;

        }


    } while (num >=1 && num <=3);

    }
    // pt bac nhat
    public static void giaiPTBac1 (){
        Scanner giaiPTBac1 = new Scanner (System.in);
        System.out.print ("Nhap vao a: ");
        int a = giaiPTBac1.nextInt();
        System.out.print ("Nhap vao b: ");
        int b = giaiPTBac1.nextInt();
        if (a == 0){
            if (b == 0){
                System.out.println ("Phuong trinh vo so nghiem");


            } else {
                System.out.println ("Phuong trinh vo nghiem");
            }
        } else {
            double nghiem = (double) -b/a;
            System.out.print ("Phuong trinh co nghiem");
            System.out.printf ("%.2f\n", + nghiem);
        }


    }
// phuong trinh bac 2
public static void giaiPTBac2 (){
    Scanner giaiPTBac2 = new Scanner (System.in);
    System.out.println ("Nhap vao a: ");
    double a = giaiPTBac2.nextDouble();
    System.out.println ("Nhap vao b: ");
    double b = giaiPTBac2.nextDouble();
    System.out.println ("Nhap vao c: ");
    double c = giaiPTBac2.nextDouble();
    if (a == 0) {
        if ( b == 0) {
            System.out.println ("Phuong trinh vo nghiem");

        } else {
            double nghiemPT1 = (-c/b);
            System.out.print ("Phuong trinh co nghiem la: ") ;
            System.out.printf("%.2f\n", + nghiemPT1);

        }
    } if (a != 0){
        double delta = Math.pow (b,2) - (4*a*c);
        if (delta < 0) {
            System.out.println ("Phuong trinh vo nghiem");
        }
        if (delta == 0){
            double nghiemKep = - b / (2 * a);
            System.out.println ("Phuong trinh co nghiem la: " + nghiemKep);
        }
        if (delta > 0){
            double nghiemX1 = (-b + Math.sqrt(delta)) / (2 * a);
            double nghiemX2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf ("Phuong trinh co nghiem la : ");
            System.out.printf ("%.2f và", + nghiemX1);
            System.out.printf ("%.2f\n", + nghiemX2 ); 
        }
        }

    }
    // tinh tien dien
    public static void tinhTienDien () {
        Scanner tienDien = new Scanner(System.in);
        System.out.println ("Nhap vao so dien su dung ");
        double soDienSuDung = tienDien.nextDouble();
        if (soDienSuDung <= 50){
            double giaTien = soDienSuDung * 1000;
            System.out.print ("So tien dien thang nay la: ");
            System.out.printf ("%.0f", + giaTien);
            System.out.print ("VND\n");

        }
        else {
            double giaTien = 50 * 1000 + ((soDienSuDung - 50) * 1200);
            System.out.println ("So tien dien thang nay la : ");
            System.out.printf ("%.0f", + giaTien);
            System.out.print ("VND\n");

        }
    }

}
