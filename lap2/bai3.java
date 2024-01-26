import java.util.Scanner;

public class bai3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuoi;
      String  ten;
        System.out.print("nhap ho va ten:");
        ten = sc.nextLine();
        System.out.print("nhap tuoi");
        tuoi =sc.nextInt();
        if(tuoi<16) System.out.print("ban "+ ten +" o do tuoi vi thanh nien");
        else{
            if(tuoi>=16 && tuoi<18)
            System.out.print("ban "+ ten +" o do tuoi truong thanh ");
            else System.out.print("ban "+ ten +" da gia");
        }
    }
}