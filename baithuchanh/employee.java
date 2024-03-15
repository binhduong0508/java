import java.util.Scanner;

public class employee  {
    public String hovaten,ID;
   public float luong,trocap,tong; 
   public void nhapthongtin(){
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap hoten: ");
    hovaten= sc.nextLine();
    System.out.print("nhap ma nhan vien: ");
    ID= sc.nextLine();
    System.out.print("nhap so luong:");
    luong= sc.nextFloat();
    System.out.print("nhap tro cap:");
    trocap= sc.nextFloat();
     }
     public void tinhtien(){
        tong = luong + trocap;
     }
     public void xuatthongtin(){
        System.out.println("thong tin nhan vien");
        System.out.println(hovaten +"-" + ID);
        System.out.println("luong:"+ luong);
        System.out.println("tro cap:"+trocap );
        System.out.println("tong tien nhan:"+tong);

     }
}
