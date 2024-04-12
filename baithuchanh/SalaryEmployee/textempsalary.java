package SalaryEmployee;

public class textempsalary {
    public static void main(String[] args) {
        
    
    Employeefulltime sep = new Employeefulltime("le van a");
    sep.TypeEmployee();
    sep.Salaryofmonth();
    Employeefulltime nv1 = new Employeefulltime("le van b");
    nv1.TypeEmployee();
    nv1.Salaryofmonth();
    Employeefulltime nv2 = new Employeefulltime("le van c",10);
    nv2.TypeEmployee();
    nv2.Salaryofmonth();
    Employeeparttime nv3 = new Employeeparttime("le van d", 20);
    nv3.TypeEmployee();
    nv3.CaculateSalary();
    sep.CaculateSalary();
    nv1.CaculateSalary();
    nv2.CaculateSalary();
    nv3.CaculateSalary();
    sep.Display();
    nv1.Display();
    nv2.Display();
    nv3.Display();

    }
}
