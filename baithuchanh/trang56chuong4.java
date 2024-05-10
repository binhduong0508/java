import java.util.HashSet;
import java.util.Scanner;

public class trang56chuong4 {
    public static void main(String[] args) {
        String name;
       HashSet<String> hashstring = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    hashstring.add("Nhat");
    hashstring.add("Nhi");
    hashstring.add("Tam");
    hashstring.add("Tu");
    hashstring.add("Ngu");
    System.out.println("Cac phan tu trong hashset: "+ hashstring);
    System.out.println("nhap phan tu can them: ");
    name = sc.nextLine();
    if( hashstring.contains(name)){
      hashstring.remove(name);
      System.out.println("xoa thanh cong !");
      System.out.println("danh sach sau xoa: "+ hashstring);
    }else System.out.println("ban "+ name +" khong ton tai !");   

    }
}
