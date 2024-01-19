import java.util.Scanner;
public class phuongtrinhbacnhat {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("nhap a:");a = sc.nextDouble();
        System.out.print("nhap b:");b = sc.nextDouble();
        Double x = -b/a;
        if(a == 0){
            System.out.print("pt vo nghiem");
        }
        else{
            System.out.printf("x = %.2f",x);
        }
}
}
            

