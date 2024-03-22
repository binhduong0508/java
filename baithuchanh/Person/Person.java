package Person;

import java.util.Scanner;

public class Person {
    public String job;
    public String Fullname;
    public int Age;
    public long IDcard;
    public void Tennghenghiep(){
    System.out.println(job);
    }
    public void nhapthongtin(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Ten:");
        Fullname=sc.nextLine();
        System.out.print("Tuoi:");
        Age=sc.nextInt();
        System.out.print("CCCD:");
        IDcard=sc.nextLong();
    }
    public void inthongtin(){
    System.out.println("Ten:"+Fullname);
    System.out.println("Tuoi:"+Age);
    System.out.println("CCCD:"+IDcard);
    }

}
