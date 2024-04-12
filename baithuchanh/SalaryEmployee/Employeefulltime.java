package SalaryEmployee;


public class Employeefulltime extends Employee {
    public int Datework;
    public String Type;
    public long Salaryofmonth;
     public  Employeefulltime(String fullname){
     this.fullname = fullname;
    }
    public Employeefulltime(String fullname,int Datework){
        this.fullname=fullname;
        this.Datework=Datework;
    }
    @Override
    public String TypeEmployee(){
    return "nhan vien toan thoi gian";
    }      
    public void Salaryofmonth(){
        switch (Type) {
            case "sep":
               this.Salaryofmonth=20000000;
                break;
        
            default: this.Salaryofmonth=10000000;
                break;
        }
    }
    public void CaculateSalary(){
        salary=Datework*800000 +Salaryofmonth;
    }
}
