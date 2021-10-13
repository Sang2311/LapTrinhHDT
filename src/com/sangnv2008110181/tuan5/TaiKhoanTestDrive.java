package com.sangnv2008110181.tuan5;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan();
        System.out.println("Tên ngân hàng: " + tk.tenNganHang);
        System.out.println();

        TaiKhoan tk1 = new TaiKhoan("Nguyễn Văn Sang");
        System.out.println("Tên khách hàng: " + tk1.tenTaiKhoan);
        System.out.println();

        TaiKhoan tk2 = new TaiKhoan("23/11/2002", "523 - Sa Đéc");
        System.out.println("Ngày Sinh: " + tk2.namSinh);
        System.out.println("Địa chỉ: " + tk2.diaChi);
        System.out.println();

        TaiKhoan tk3 = new TaiKhoan("0926324050", "900.000 VNĐ", "13/10/2021");
        System.out.println("Số tài khoản: " + tk3.soTaiKhoan);
        System.out.println("Số dư: " + tk3.soDu);
        System.out.println("Ngày cấp thẻ: " + tk3.ngayCapThe);
        System.out.println();

    }
    
}
