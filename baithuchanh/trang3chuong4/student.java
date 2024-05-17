package trang3chuong4;

import java.util.Scanner;

public class student {
  public String fullname;
  public int age;
  public String cccd;
  public String gioi;
  Scanner sc = new Scanner(System.in);
  public void nhapthongtin(){
    System.out.print("nhap ten: ");
    fullname = sc.nextLine();
    System.out.print("nhap tuoi: ");
    age = sc.nextInt();
  }
  public void inthongtin(){
    System.out.println(fullname +"-"+ age);
  }
  public void newthongtin(){
    System.out.print("nhap cccd: ");
     cccd = sc.next();
    System.out.print("nhap gioi tinh: ");
     gioi =sc.next();
  }
  public void innewthongtin(){
    inthongtin();
    System.out.println("can cuoc cong dan: "+ cccd);
    System.out.println("gioi tinh: "+ gioi);

  }

  public void suathongtin(){
   System.out.println("nhap ten sua: ");
   fullname = sc.next();
   innewthongtin();

    }
  }



