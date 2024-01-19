import java.util.Scanner;

public class baitapthuchanhjava2 {
    public static void main(String[] args) throws Exception {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a:");a=sc.nextInt();
        System.out.println("nhap b:");b=sc.nextInt();
        System.out.println("nhap c:");c=sc.nextInt();
        double delta = Math.pow(b,2)-4*a*c;
        if(delta<0){
            System.out.println("Vo nghiem");
        }
        else if(delta==0){
            System.out.println("Nghiem kep");
        }
        else {
            System.out.println("2 nghiem");
        }
    }
}
