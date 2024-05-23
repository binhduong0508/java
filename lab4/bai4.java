import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
    String loaitraicay;
    int n;
    Scanner scanner = new Scanner(System.in);
    HashSet<String> hashstr = new HashSet<String>();
    
    System.out.print("Nhap so loai qua  : ");
    n = Integer.parseInt(scanner.nextLine());   
         
    System.out.println("Nhap vao ten cac loai trai cay! ");
    for (int i = 1; i < n; i++) {
        System.out.print("Nhap ten loai trai cay thu " + i + ": ");
        loaitraicay = scanner.nextLine();
        hashstr.add(loaitraicay);
    }
    System.out.println("So loai qua  = " + hashstr.size());
    System.out.println("Nhap ten loai trai cay can tim: ");
    String tim = scanner.nextLine();
    if (hashstr.contains(tim)) {
        System.out.println("Co trai cay " + tim + "!");
    } else {
        System.out.println("Khong tim thay " + tim+ "!");
    }
    System.out.println("Nhap vao ten loai trai cay can xoa : ");
    String xoa = scanner.nextLine();
 
    if (hashstr.contains(xoa)) {
        hashstr.remove(xoa);
        System.out.println("Xoa thanh cong !");
        System.out.println("So loai con lai: " + hashstr);
    } else {
        System.out.println("Xoa khong thanh cong !");
    }
    List<String> liststr = new ArrayList<>();
    liststr.add("Quyt");
    liststr.add("Cam");
    liststr.add("Vu Sua");
    liststr.add("Sung");
    hashstr.addAll(liststr);
    System.out.println("Cac phan tu co trong danh sach sau them : ");
    Iterator<String> iterator = hashstr.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");
    }
    hashstr.removeAll(liststr);
    System.out.println("\nCac phan tu co trong danh sach sau xoa: " + hashstr);
}
}
