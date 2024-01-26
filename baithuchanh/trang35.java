import java.util.Scanner;

public class trang35 {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     float a,b;
     System.out.print("nhap a:");
      a= sc.nextFloat();
     System.out.print("nhap b:");
      b= sc.nextFloat();
     if(a<b)
     System.out.printf("so be nhat la:"+a);
     else {
        if(a==b)
        System.out.printf("hai so bang nhau va bang"+a);
        else 
        System.out.printf("so be nhat la:"+b);
     }
}
}
