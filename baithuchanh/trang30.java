import java.util.Scanner;

public class trang30 {
    public static void main(String[] args) {
        int n,sum=0,du;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap n:");n=sc.nextInt();
        while(n>0){
            du= n % 10;
            n= n / 10;
           sum+= du;
        }
        System.out.print("tong la:"+ sum );
    }
}
