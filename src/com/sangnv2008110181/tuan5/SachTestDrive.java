package com.sangnv2008110181.tuan5;

public class SachTestDrive {
    public static void main(String[] args) {
        // ham tạo mặc định
        Sach book = new Sach(); 
        System.out.println("Tên nhà xuất bản: " + book.tenNhaSX);
        System.out.println();
       // ham tạo 1 tham số
        Sach book0 = new Sach(2000); 
        System.out.println("Xuất bản lần đầu: " + book0.namXB);
        System.out.println();
       // ham tạo 2 tham số
        Sach book1 = new Sach("Đắc Nhân Tâm", "158.000 VNĐ"); 
        System.out.println("Tên Sách: " + book1.tenSach);
        System.out.println("Giá tiền: " + book1.giaTien);
        System.out.println();
        // ham tạo 3 tham số
        Sach book2 = new Sach("Đắc Nhân Tâm", "1 cuốn", "Giáo Dục Con Người"); 
        System.out.println("Tên sách: " + book2.tenSach);
        System.out.println("Số lượng: " + book2.soLuong);
        System.out.println("Thể loại: " + book2.loai);
        System.out.println();

    }
    
}
