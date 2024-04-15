package SalaryEmployee;

import SalaryEmployee.Employeefulltime;
import SalaryEmployee.Employeeparttime;

public class textempsalary {
    public static void main(String[] args) {
       Employeefulltime sep = new Employeefulltime("Nguyen Van A");
        sep.Position(salary.sep);
        Employeefulltime nv1 = new Employeefulltime("Nguyen Van B"); 
        Employeefulltime nv2 = new Employeefulltime("Nguyen Van C", 5); 
        Employeeparttime thoiVu = new Employeeparttime("Nguyen Van D", 100);  

        sep.CaculateSalary();
        nv1.CaculateSalary();
        nv2.CaculateSalary();
        thoiVu.CaculateSalary();

        sep.Display();
        nv1.Display();
        nv2.Display();
        thoiVu.Display();
    }
}

