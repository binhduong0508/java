import java.util.Scanner;

public class tinhchuvidientichhinhtron {
    public double bankinh,chuvi,dientich;
    Scanner sc = new Scanner(System.in);
    public  void nhapbankinh(){
        System.out.print("bankinh: ");
        bankinh = sc.nextDouble();
    }
   public void tinhchuvi(){
     chuvi =bankinh * 2 * Math.PI * 1d;
   }
   public void tinhdientich(){
     dientich = bankinh*bankinh*Math.PI;
   }
   public void inchuvi(){
    System.out.println("chu vi:"+ chuvi);
   }
   public void indientich(){
    System.out.println("dien tich:"+ dientich);
   }
}
