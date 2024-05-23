
import java.util.LinkedList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
         int n,so,sum=0, dem=0;
         double tbc=0;
         Scanner sc = new Scanner(System.in);
         System.out.print("nhap so phan tu: ");
         n= sc.nextInt();
         LinkedList<Integer> linkint = new LinkedList<>();
         for(int i=0; i<n;i++){
         System.out.print("nhap phan tu thu "+ i +": ");
          so = sc.nextInt();
          linkint.add(so);
         }
         for(int i=0; i< n; i++){
            if(linkint.get(i) % 2== 0) {sum+= linkint.get(i);
            dem++;
            }
         }
        tbc = sum/dem;
        System.out.print("trung binh cong cua cac so chan co trong day: "+ tbc);
        


    }
}