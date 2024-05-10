import java.util.HashSet;
import java.util.Scanner;

public class trang54chuong4 {
  public static void main(String[] args) {
    int number;
    HashSet<Integer> hashint = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    hashint.add(0);
    hashint.add(9);
    hashint.add(8);
    hashint.add(7);
    hashint.add(6);
    System.out.println("Cac phan tu trong hashset: "+ hashint);
    System.out.println("nhap phan tu can them: ");
    number = sc.nextInt();
    if(! hashint.contains(number)){
      hashint.add(number);
      System.out.println("them thanh cong !");
      System.out.println("danh sach sau them: "+ hashint);
    }else System.out.println("phan tu "+ number +" da ton tai !");
  }
}

