import java.util.Scanner;

public class trang40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ngay;
        System.out.print("nhap ngay:") ;
        ngay=sc.nextInt();
        switch (ngay) {
            case 0: System.out.print("chu nhat");
                break;
                case 1: System.out.print("thu hai");
                break;
                case 2: System.out.print("thu ba");
                break;
                case 3: System.out.print("thu tu");
                break;
                case 4: System.out.print("thu nam");
                break;
                case 5: System.out.print("thu sau");
                break;
                case 6: System.out.print("thu bay");
                break;
            default:System.out.print("so ngay trong tuan sai");
                break;
        }
    }
}
