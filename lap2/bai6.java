import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        do{
        System.out.print("nhap n:");
        n=sc.nextInt();
        }while(n<0);
        int giaithua=n;
        for(int i=2;i<n;i++)
         giaithua=giaithua*i;
         System.out.println("giai thua cua "+n+" la:"+giaithua);
    }
}
