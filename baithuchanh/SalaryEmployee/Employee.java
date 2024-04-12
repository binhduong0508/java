package SalaryEmployee ;

public class Employee {
    public String fullname;
   public String ID;
   public  long salary;
   public Employee(){

   }
   public Employee(String fullname){
    this.fullname=fullname;
   }
   public String TypeEmployee(){
    return "";
   }
   public void Display(){
    System.out.print("nhan vien: "+ fullname );
    System.out.print("loai nhan vien: "+ TypeEmployee());
    System.out.println("luong"+ salary + "VND");
   }
}
