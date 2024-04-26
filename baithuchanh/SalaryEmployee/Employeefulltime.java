package SalaryEmployee;

public class Employeefulltime extends Employee {
    public int Datework;
    public int Type;
    public  Employeefulltime(String fullname){
        super(fullname);
        this.Type = salary.nhanvien;
    }
    public Employeefulltime(String fullname,int Datework){
        super(fullname);
        this.Datework = Datework;
        this.Type=salary.nhanvien;
    }
    public void Position(int Type ){
        this.Type = Type;
    }
    @Override
    public String TypeEmployee(){
      if(salary.nhanvien)
      return "nhan vien toan thoi gian" + ("co lam them "+ Datework + " ngay");
      else
      return "sep toan thoi gian" + ("co lam them "+ Datework + " ngay");
    }      
   
    public void CaculateSalary(){
     if(salary.nhanvien)
     salary = salary.luongfullnv+ Datework*salary.extrasalary;
     else{
        if(salary.sep)
     salary = salary.luongfullsep+ Datework*salary.extrasalary;  
     }
        
    }
}
