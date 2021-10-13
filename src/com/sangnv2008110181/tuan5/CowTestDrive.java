package com.sangnv2008110181.tuan5;

public class CowTestDrive {
    public static void main (String[] args){
        Cow cow;
        cow = new Cow();
        cow.inThongTin();
        cow.moo();
        cow = new Cow (10);
        cow.inThongTin();
        cow.moo();
        cow = new Cow(9, 1);
        cow.inThongTin();
        cow.moo();

    }
    
}
