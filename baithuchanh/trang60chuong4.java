
import java.util.LinkedHashSet;
import java.util.Scanner;

public class trang60chuong4 {
    public static void main(String[] args) {
          String name;
       LinkedHashSet<String> linkhashstring = new LinkedHashSet<>();
    Scanner sc = new Scanner(System.in);
    linkhashstring.add("Nhat");
    linkhashstring.add("Nhi");
    linkhashstring.add("Tam");
    linkhashstring.add("Tu");
    linkhashstring.add("Ngu");
    System.out.println("Cac phan tu trong hashset: "+ linkhashstring);
    System.out.println("nhap phan tu can them: ");
    name = sc.nextLine();
    if( linkhashstring.contains(name)){
      linkhashstring.remove(name);
      System.out.println("xoa thanh cong !");
      System.out.println("danh sach sau xoa: "+ linkhashstring);
    }else System.out.println("ban "+ name +" khong ton tai !");   
    }
}
