package lab1;
import java.util.Scanner;
public class phan2bai3 {
    public static void main(String[] args) 
    {
        int canh;
        double ketQua;
        Scanner tinhTheTich;
        tinhTheTich = new Scanner(System.in);
        
        System.out.println("Nhap vao canh: ");
        canh = tinhTheTich.nextInt();
        ketQua = Math.pow(canh, 3);
        System.out.println("Thể tích là: " + ketQua);  
        tinhTheTich.close();  
    }
    
}
