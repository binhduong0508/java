import java.util.Scanner;

public class bai1{
    public static void main(String[] args) throws Exception{
         Scanner sc = new Scanner(System.in);
         double a,b,Tong,Hieu,Tich,Thuong,Chia;
         System.out.print("nhap a: ");a = sc.nextDouble();
         System.out.print("nhap b: ");b = sc.nextDouble();
         Tong=a+b;
         Hieu=a-b;
         Tich=a*b;
         Thuong=a/b;
         Chia=a%b;
         System.out.printf("Tong: %.2f",Tong);
         System.out.printf("~Hieu: %.2f",Hieu);
         System.out.printf("~Tich: %.2f",Tich);
         System.out.printf("~Thuong: %.2f",Thuong);
         System.out.printf("~Chia: %.2f",Chia);
         if(a>b){ System.out.println(" a lon hon b");
    }
         else {if(a==b) System.out.println(" a bang b");
         else System.out.println(" a be hon b");
}


    }
}
