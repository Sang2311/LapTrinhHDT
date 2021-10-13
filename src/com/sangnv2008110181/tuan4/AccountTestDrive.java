package com.sangnv2008110181.tuan4;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account;
        account = new Account(123,500);
        account.showData();
        account.napTien(500);
        account.showData();
        account.rutTien(100);
        account.showData();
        Customer customer1 = new Customer("Nguyen Van Sang",2002,"Nam");
        customer1.getName();
        System.out.println();
        Address address = new Address(523, "Dong Thap","Viet Nam");
        address.showAddress();
    }
}