import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class bai5main {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Map<String, bai5> danhsachSV = new HashMap<>();
        System.out.print("Nhap so luong sinh vien : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap thong tin sinh vien  " + i + " ! ");
            System.out.print("Nhap ten : ");
            String fullname = scanner.next();
            System.out.print("Nhap msv : ");
            String studentID = scanner.next();
            System.out.print("Nhap lop : ");
            String Class = scanner.next();

            bai5 sv = new bai5(fullname, studentID, Class);
            danhsachSV.put(studentID, sv);
        }
        System.out.print("Nhap lop can tim: ");
        String tim = scanner.next();
        System.out.println("Danh sach sinh vien thuoc lop " + tim + ":");
        Set<Map.Entry<String, bai5>> setHashMap = danhsachSV.entrySet();
        for(Map.Entry<String, bai5> setEntry : setHashMap) {
            if (setEntry.getValue().Class.equals(tim)) {
                System.out.println(setEntry.getValue().fullname + " - " + setEntry.getValue().studentID);
            }
        }
        System.out.print("Nhap msv can tim : ");
        String timmsv = scanner.next();
        bai5 sinhvien = danhsachSV.get(timmsv);
        if (sinhvien != null) {
            System.out.println("Thong tin sinh vien: ");
            System.out.println("Ten sv : " + sinhvien.fullname);
            System.out.println("msv : " + sinhvien.studentID);
            System.out.println("lop : " + sinhvien.Class);
        } else {
            System.out.println("khong co!");
        }
    }
}

