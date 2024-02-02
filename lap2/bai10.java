import java.util.Scanner;

public class bai10 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String chuoi;
    char n;
    int dem=0;
    do{
    System.out.print("nhap vao 1 chuoi:");
    chuoi=sc.nextLine();
    }while(chuoi.length()>80);
    System.out.print("nhap 1 ki tu:");
    n=sc.next().charAt(0);
    for(int i=0;i<chuoi.length();i++){
     if(n == chuoi.charAt(i))
     dem++;
    }
    System.out.print("so lan xuat hien trong chuoi la:"+dem);
   }
}
