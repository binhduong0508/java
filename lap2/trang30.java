import java.util.Scanner;

public class trang30 {
    public static void main(String[] args) {
        int n,sum;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap n:");n=sc.nextInt();
        sum = 0;
        if(n<10)
            sum = sum +n;
        else {
         for(int i=1;i<=n;i++){
       
          sum = sum + n % 10;
          n= n / 10;
         }
        }
        System.out.print("tong la:"+ sum );
    }
}
