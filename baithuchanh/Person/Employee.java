package Person;

import java.util.Scanner;

public class Employee extends Person{
    public String EmployeeID;
    public String Group;
    public String Position;
    public float salary;
    public float Subsidize;
    public Employee(){
        job="nhan vien";
    }
    public void nhapthongtinnv(){
    Scanner sc = new Scanner(System.in);    
    System.out.print("ma nhan vien:");
    EmployeeID=sc.nextLine();
    System.out.print("phong:");
    Group=sc.nextLine();
    System.out.print("chuc vu:");
    Position=sc.nextLine();
    System.out.print("luong co ban:");
    salary=sc.nextFloat();
    System.out.print("tro cap:");
    Subsidize=sc.nextFloat();
    }
    public void inthongtinnv(){
        System.out.println("luong cua "+Fullname+" la:"+salary);
    }

    }