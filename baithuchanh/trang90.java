import java.util.Scanner;

public class trang90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kitu;
        System.out.print("nhap vao 1 chuoi:");
        chuoi=sc.nextLine();
        System.out.println("cac ki tu co trong chuoi la:");
        for(int i=0;i<chuoi.length();i++){
            kitu= chuoi.charAt(i);
            System.out.println(kitu);
        }

    }
}
