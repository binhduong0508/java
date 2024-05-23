package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrint = new ArrayList<>();
        int n,number;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang: ");
        n = sc.nextInt();
        for( int i=0; i<n; i++){
        System.out.print("nhap phan tu thu "+ i+ ":");
        number =sc.nextInt();
        arrint.add(number);
        }
        arrint.sort((o1,o2)->o2-o1);
        int max=arrint.get(0);
        
        System.out.println("gia tri lon nhat la: "+max);
        int them;
        System.out.print("nhap them vao 1 so: ");
        them= sc.nextInt();
        ArrayList<Integer> arrA = new ArrayList<>();
        arrA.add(them);
        if( arrint.contains(them)){
            arrint.remove(them);
            System.out.println("xoa thanh cong !");  
        arrint.removeAll(arrA);
        System.out.println("danh sach sau xoa la: "+ arrint);
        }else System.out.println("phan tu "+ them +" khong ton tai !");

    }
}
