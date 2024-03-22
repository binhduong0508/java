package Hinhhocs;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float chieucao;
    public Hinhtru(){
        Ten="Hinh tru";
    }
    public void nhapchieucao(){
        nhapbankinh();
Scanner sc= new Scanner(System.in);
System.out.print("nhap chieu cao:");
chieucao= sc.nextFloat();
    }
    public void tinhthetich(){
        tinhdientich();
        Thetich= Dientich*chieucao;
    }
}
