package com.sangnv2008110181.kiemtragiuaki;
import java.util.ArrayList;
public class DanhSachQuanLy {
    private ArrayList<Object> list = new ArrayList<Object>();
    public void themNguoi(Object object){
        list.add(object);
    }
    public void inList(){
        for(Object obj: list){
            System.out.println(obj.toString());
            
        }
         }
    
}
