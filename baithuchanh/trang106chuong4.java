
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class trang106chuong4 {
    public static void main(String[] args) {
         TreeMap<Integer,String> hashstr = new TreeMap<>();
        hashstr.put(1, "nguyen");
        hashstr.put(4, "moi");
        hashstr.put(5, "tran");
        hashstr.put(2, "thanh");
        hashstr.put(3, "binh"); 
        Set<Map.Entry<Integer,String>> sethash = hashstr.entrySet();
        System.out.println("cac entry co trong sethash: " + sethash);
    }
}
