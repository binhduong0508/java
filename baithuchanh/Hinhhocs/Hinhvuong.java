package Hinhhocs;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat {
    Scanner sc=new Scanner(System.in);
    public  Hinhvuong(){
        Ten="Hinh vuong";
    }
    public void nhapcanh(){
      System.out.print("Canh:");
      dai=rong=sc.nextFloat();
    }
}
