package SalaryEmployee;

public class Employeeparttime extends Employee {
    private int hours ;
    public Employeeparttime(String fullname, int hours){
        this.fullname = fullname;
        this.hours = hours;
    }
    @Override
    public String TypeEmployee(){
        return "nhan vien thoi vu";
    }
    public void CaculateSalary(){
      salary = hours * 100000;
    }
}
