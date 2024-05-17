import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class trang86chuong4 {
    public static void main(String[] args) {
        HashMap<String,String> hashstr = new HashMap<>();
        hashstr.put("bo", "moi");
        hashstr.put("nguyen", "moi");
        hashstr.put("viet", "tran");
        hashstr.put("binh", "thanh");
        hashstr.put("duong", "binh"); 
        Set<Map.Entry<String,String>> sethash = hashstr.entrySet();
        System.out.println("cac entry co trong sethash: " + sethash);
    }
}
