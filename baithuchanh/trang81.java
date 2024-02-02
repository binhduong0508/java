import java.util.Scanner;

public class trang81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("nhap so cot: ");
        a=sc.nextInt();
        System.out.print("nhap so cot: ");
        b=sc.nextInt();
        int A[][]= new int[a] [b];
        System.out.println("nhap cac phan tu cho ma tran");
        for(int i=0;i<a;i++)
        for(int j=0;j<a;j++){
        System.out.println("A["+i+"]["+j+"]=");
        A[i][j]=sc.nextInt();
        }
        int max=A[0][0];
        for(int i=0;i<a;i++)
        for(int j=0;j<a;j++){
            if(A[i][j]>max) 
            max=A[i][j];
        }
        System.out.println("so lon nhat la: "+ max);
    }
}
