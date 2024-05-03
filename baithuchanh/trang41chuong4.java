import java.util.LinkedList;
import java.util.Scanner;

public class trang41chuong4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         LinkedList<String> linkstr = new LinkedList<>();
         for (int i= 1; i<13; i++)
         linkstr.add("thang "+ i);
         System.out.print("nhap so phan tu can lay: ");
         int index = sc.nextInt();
         if (index<0|| index > (linkstr.size()-1)){
            System.out.print("chi so can lay can lon hon 0 va nho hon " +(linkstr.size()-1)+ "!");
         }else{
           String node = linkstr.get(index) ;
           System.out.println("phan tu co chi so = "+ index + "trong linkedlist la: "+ node);
         }
         String first = linkstr.getFirst();
         String last = linkstr.getLast();
         System.out.println("phan tu dau trong danh sach: "+ first +"\t" + "phan tu cuoi trong danh sach la: "+ last);
    }
}
