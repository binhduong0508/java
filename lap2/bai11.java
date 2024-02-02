
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,doi;
    do{
        System.out.print("nhap so phan tu cua mang: ");
        n =sc.nextInt();
    } while(n <0);
    int A[] = new int [n];
    int i;
    System.out.println("nhap cac phan tu cho mang");
    for( i=0; i< A.length;i++){
    System.out.print("A["+i+"]:");
    A[i]=sc.nextInt();
    }
    System.out.println("cac phan tu ban dau la:");
    for(i=0;i<A.length;i++){
    System.out.print(A[i]+";");
    }
    for( i=0;i<A.length-1;i++){
    for(int j=i+1;j<A.length;j++)
     if(A[i]>A[j]){
        doi=A[i];
        A[i]=A[j];
        A[j]=doi;
     }
    }
    System.out.println(" cac phan tu sau khi sap xep tu be den lon:");
    for(i=0;i<A.length;i++){
    System.out.print(A[i]+";");
    }
    }  
}
