import java.util.Scanner;

public class phuongtrinhbachai {
    public static void main(String[] args) throws Exception {
        double a,b,c;
        double x1,x2;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap a:");a=sc.nextDouble();
        System.out.print("nhap b:");b=sc.nextDouble();
        System.out.print("nhap c:");c=sc.nextDouble();
        if(a==0){
            System.out.println("ko phai phuong trinh bac 2");
        }
        else {
        double delta = Math.pow(b,2)-4*a*c;
        if(delta<0){
            System.out.print("Vo nghiem");
        }
        else if(delta==0){
            System.out.print("Nghiem kep");
         x1= -b/(2*a);
        System.out.printf("x1=%.2f",x1);
        }
        else {
            System.out.print("2 nghiem");
            x1=(-b)+Math.sqrt( delta)/2*a;
            x2=(-b)-Math.sqrt( delta)/2*a;
            System.out.printf("x1=%.2f",x1);
            System.out.printf("x1=%.2f",x2);
            
        }
    } 
}

}
