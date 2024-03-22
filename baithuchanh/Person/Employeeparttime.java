package Person;

import java.util.Scanner;

public class Employeeparttime extends Employee {
   public float Hours;
   public Employeeparttime(){
      job ="nhan vien ban thoi gian";
  } 
   public void nhapparttime(){

        Scanner sc= new Scanner(System.in);
        System.out.print("gio lam viec:");
        Hours=sc.nextFloat();
        }
   public void tinhluongparttime(){
         salary= (salary*Hours )+ Subsidize;
     }     

}
