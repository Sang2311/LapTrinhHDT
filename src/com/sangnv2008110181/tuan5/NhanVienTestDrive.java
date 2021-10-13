package com.sangnv2008110181.tuan5;

public class NhanVienTestDrive {
    public static void main(String[] args){
        // ham tao mac dinh
        NhanVien nv = new NhanVien(); 
        System.out.println("Địa điểm kinh doanh: " + nv.diaChi);
        System.out.println();
        // ham tao 1 tham so
        NhanVien nv1 = new NhanVien("Phục Vụ"); 
        System.out.println("Bộ phận làm việc: " + nv1.boPhanLamViec);
        System.out.println();
         // ham tao 2 tham so
        NhanVien nv2 = new NhanVien("Nguyễn Văn Sang", "23/11/2002"); 
        System.out.println("Tên Nhân Viên: " + nv2.tenNhanVien);
        System.out.println("Ngày sinh: " + nv2.ngaySinh);
        System.out.println();
        // ham tao 3 tham so
        NhanVien nv3 = new NhanVien("Nguyễn Văn Sang", "Pha Chế", "10.000.000"); 
        System.out.println("Tên Nhân Viên: " + nv3.tenNhanVien);
        System.out.println("Bộ Phận Làm Việc: " + nv3.boPhanLamViec);
        System.out.println("Lương: " + nv3.tienLuong);
        System.out.println();
    }
    
}
