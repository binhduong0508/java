import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        String fullname, thongtin = null;
    String dsthongtin[];   
    double diem;
    LinkedList<String> danhsachSV = new LinkedList<>();
    LinkedList<String> svthilai = new LinkedList<>();
    LinkedList<String> svdiemcao = new LinkedList<>();
    LinkedList<String> svcantim = new LinkedList<>();
         
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("nhap ho ten : ");
        fullname = scanner.nextLine();
        if (!fullname.isEmpty()) {
            System.out.println("nhap diem : ");
            diem = Double.parseDouble(scanner.nextLine());
            thongtin= fullname + "\t" + diem;
            danhsachSV.add(thongtin);
        }
    } while (!fullname.isEmpty());  
    System.out.println("Số sinh viên có trong danh sách = " + (danhsachSV.size()));
    System.out.println("Thông tin của các sinh viên vừa nhập là: ");
    System.out.println("Tên sinh viên - Điểm");
    Iterator<String> iterator = danhsachSV.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    for (int i = 0; i < danhsachSV.size(); i++) {
     String sv = danhsachSV.get(i);  
        dsthongtin= sv.split("\t");
        double point = Double.parseDouble(dsthongtin[1]);
        if (point <= 5) {
            svthilai.add(sv);
        }
    }
             
    if (svthilai.isEmpty()) {
        System.out.println("Không có sinh viên phải thi lại!");
    } else {
        System.out.println("Số sinh viên phải thi lại = " + (svthilai.size()));
        System.out.println("Thông tin của các sinh viên phải thi lại là: ");
        System.out.println("Tên sinh viên - Điểm");
        iterator = svthilai.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
         
    double max = 0; 
    int i = 0;  
    while (i < danhsachSV.size()) {
        dsthongtin = danhsachSV.get(i).split("\t");
    if (Double.parseDouble(dsthongtin[1]) >= max) {
            max = Double.parseDouble(dsthongtin[1]);
        }
        i++;
    }
    i = 0;
    while (i < danhsachSV.size()) {
        dsthongtin = danhsachSV.get(i).split("\t");
         if (Double.parseDouble(dsthongtin[1]) == max) {
            svdiemcao.add(danhsachSV.get(i));
        }
        i++;
    }
         
    System.out.println("Thông tin của các sinh viên có điểm cao nhất là: ");
    System.out.println("Tên sinh viên\t Điểm");
    iterator = svdiemcao.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    System.out.println("Nhập tên sinh viên cần tìm: ");
    String search = scanner.nextLine();
         
    i = 0;
    while (i < danhsachSV.size()) {
        dsthongtin = danhsachSV.get(i).split("\t");
             
       
        fullname = dsthongtin[0];
             
       
        if (search.equalsIgnoreCase(fullname)) {
            svcantim.add(danhsachSV.get(i));
        }
             
        i++;    
    }
         
    System.out.println("Thông tin của các sinh viên tên là " + search + ": ");
    System.out.println("Tên sinh viên\t Điểm");
    iterator = svcantim.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}
    }
}
