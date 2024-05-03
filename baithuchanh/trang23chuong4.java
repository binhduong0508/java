import java.util.ArrayList;
import java.util.Scanner;

public class trang23chuong4 {
 public static void main(String[] args) {
    ArrayList<Integer> arrint =new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int so;
    System.out.println("nhap so phan tu cua mang: ");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
    System.out.println("nhap phan tu thu " + i + ":");
   so = sc.nextInt();
   arrint.add(so);
  }
  int max = arrint.get(0);
  for(int i=1; i<arrint.size();i++){
    if(arrint.get(i).compareTo(max)>0){
        max = arrint.get(i);
    }
  }
  System.out.println("phan tu lon nhat trong mang la: " + max);
 }   
}
