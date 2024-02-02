import java.util.Scanner;

public class bai8  {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    do{
        System.out.print("nhap so phan tu cua mang: ");
        n =sc.nextInt();
    } while(n <0);
    int A[] = new int [n];
    System.out.println("nhap cac phan tu cho mang");
    for(int i=1; i<= n;i++){
    System.out.print("nhap phan tu thu i"+i+":");
    A[i]=sc.nextInt();
    }
    double Tong=0;
    for(int i=1; i<n;i++){
    Tong+= A[i];
    }
    System.out.print("trung binh cong:"+ Tong/n);
    }
}
