package Hinhhocs;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
    public float dai,rong;
    Scanner sc = new Scanner(System.in);
    public Hinhchunhat(){
        Ten="Hinh chu nhat";
    }
    public void nhapchieudai(){
        System.out.print("chieu dai:");
        dai=sc.nextFloat();
    }
    public void nhapchieurong(){
    
        System.out.print("chieu rong:");
        rong= sc.nextFloat();
    }
    public void tinhchuvi(){
        Chuvi=(dai+rong)*2;
    }
    public void tinhdientich(){
        Dientich=dai*rong;
    }
}
