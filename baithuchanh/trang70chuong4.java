import java.util.Scanner;
import java.util.TreeSet;

public class trang70chuong4 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treehashint = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        treehashint.add(0);
        treehashint.add(9);
        treehashint.add(8);
        treehashint.add(7);
        treehashint.add(6);
        System.out.println("Cac phan tu trong hashset: "+ treehashint);
        System.out.println("nhap phan tu can them: ");
        number = sc.nextInt();
        if(! treehashint.contains(number)){
          treehashint.add(number);
          System.out.println("them thanh cong !");
          System.out.println("danh sach sau them: "+ treehashint);
        }else System.out.println("phan tu "+ number +" da ton tai !");
    }
}
