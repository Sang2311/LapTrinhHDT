package com.sangnv2008110181.tuan5;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        // ham tao mac dinh
        MayTinh mt = new MayTinh();
        System.out.println("Năm bảo hành: " + mt.namBaoHanh);
        System.out.println();
          // ham tao 1 tham so
        MayTinh mt1 = new MayTinh("26.000.000 VNĐ");
        System.out.println("Giá tiền: " + mt1.gia);
        System.out.println();
              // ham tao 2 tham so
        MayTinh mt2 = new MayTinh("Dell", "2021");
        System.out.println("Nhà sản xuất: " + mt2.tenNhaSanXuat);
        System.out.println("Năm sản xuất: " + mt2.namSanXuat);
        System.out.println();
         // ham tao 3 tham so
        MayTinh mt3 = new MayTinh("Window 10", "Intel Core i5-11300H", "8 GB, 3200MHz");
        System.out.println("Hệ điều hành: " + mt3.heDieuHanh);
        System.out.println("CPU: " + mt3.cpu);
        System.out.println("RAM: " + mt3.ram);
        System.out.println();
    }
}
