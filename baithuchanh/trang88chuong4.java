import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class trang88chuong4 {
    public static void main(String[] args) {
        HashMap<String,String> hashstr = new HashMap<>();
        hashstr.put("QY", "QUANG YEN");
        hashstr.put("QL", "QUANG LONG");
        hashstr.put("QT", "QUANG TRACH");
        hashstr.put("QT", "QUANG TAN");
        System.out.print("danh sach cac xa trong hashstr: ");
        Set<Map.Entry<String,String>> setentry = hashstr.entrySet();
        System.out.println(setentry);
        System.out.println("QY: "+ hashstr.get("QY"));
        System.out.println("QP: "+ hashstr.get("QP"));
        if(hashstr.containsValue("QUANG YEN"))
            System.out.println("co 'QUANG YEN' trong danh sach");
        else System.out.println("ko co 'QUANG YEN' trong danh sach");



    }
}
