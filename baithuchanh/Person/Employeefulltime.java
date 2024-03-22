package Person;

import java.util.Scanner;

public class Employeefulltime extends Employee{
    public int cong;
    public Employeefulltime(){
        job ="nhan vien toan thoi gian";
    }
    public void nhapfulltime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ngay cong:");
        cong=sc.nextInt();
    }
    public void tinhluongfulltime(){
        salary= (salary* cong* 24 )+ Subsidize;
    }
  
    
}
