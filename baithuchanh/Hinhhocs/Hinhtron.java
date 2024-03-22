package Hinhhocs;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float bankinh;
    public Hinhtron(){
        Ten = "Hinh tron";
    }
    public void nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ban kinh:");
        bankinh = sc.nextFloat();
    }
    public void tinhchuvi(){
        Chuvi= PI * bankinh * 2;
    }
    public void tinhdientich(){
        Dientich= PI * bankinh * bankinh;
    }
}
