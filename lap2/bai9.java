import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        int demso=0,deminthuong=0,deminhoa=0;
        System.out.print("nhap vao 1 chuoi:");
        chuoi=sc.nextLine();
        for(int i=0;i<chuoi.length();i++){
         if(chuoi.charAt(i)>=97 && chuoi.charAt(i)<=122)
         deminthuong++;
         else{
            if(chuoi.charAt(i)>=65 && chuoi.charAt(i)<=90) 
            deminhoa++;
            else{
                if(chuoi.charAt(i)>=48 && chuoi.charAt(i)<=57)
                demso++;
            }
         }
        
        }
    System.out.println("so chu so la:"+demso);
    System.out.println("so chu in thuong la:"+deminthuong);
    System.out.println("so chu in hoa la:"+deminhoa);
    }
    }

