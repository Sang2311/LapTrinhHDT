package com.sangnv2008110181.tuan5;

public class XeTestDDrive {
    public static void main(String[] args) {
        Xe a = new Xe("Yamaha"); 
        System.out.println("Hãng Sản Xuất: " + a.hangSanXuat);
        System.out.println();

        Xe b = new Xe("Nguyễn Văn Sang", "Yamaha YZF-R3"); 
        System.out.println("Tên Chủ Xe: " + b.tenChuXe);
        System.out.println("Tên xe: " + b.dongXe);
        System.out.println();

        Xe c = new Xe("Nhật Bản", "Xe Moto", "Có giấy"); 
        System.out.println("Xuất Xứ: " + c.xuatXu);
        System.out.println("Dòng Xe: " + c.dongXe);
        System.out.println("Giấy Phép: " + c.giayPhep);
        System.out.println();
}
    
}
