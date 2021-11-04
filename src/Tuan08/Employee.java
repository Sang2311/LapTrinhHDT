package Tuan08;

public class Employee extends Person {
    protected int salary;
    public String toString (){
        String s;
        s = getName() + "," + getBirthday();
        s += "," + salary;
        return s;
    }
}
