import java.util.Scanner;

public class student {
    public String hovaten,ID;
     public float toan,van,anh;
     public float tong=0;
  public void nhapthongtin() {
   Scanner sc = new Scanner(System.in);
   System.out.print("nhap hoten: ");
   hovaten= sc.nextLine();
   System.out.print("nhap ma sinh vien: ");
   ID= sc.nextLine();
   System.out.print("diem toan:");
   toan = sc.nextFloat();
   System.out.print("diem van:");
   van = sc.nextFloat();
   System.out.print("diem anh:");
   anh = sc.nextFloat();
  } 
  public void tinhdiemtong(){
    tong= toan + van + anh;
  }
  public void xuatthongtin(){
    System.out.println("thong tin sinh vien");
    System.out.println(hovaten +"-" + ID);
    System.out.println("toan:"+ toan);
    System.out.println("van:"+ van);
    System.out.println("anh:"+ anh);
    System.out.println("tong:"+ tong);
  }
}

