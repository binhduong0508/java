import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
       int n, sum=0;
       do {
        System.out.print("nhap so nguyen bat ky: ");
        n = sc.nextInt();
        sum = sum + n;
       } while (sum<100);
       System.out.printf("tong la: "+ sum);
    }
}
