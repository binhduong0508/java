
import java.util.LinkedHashMap;

public class trang94chuong4 {
    public static void main(String[] args) {
      
        LinkedHashMap<Integer,String> hashstr = new LinkedHashMap<>();
        hashstr.put(1 , " QUANG YEN");
        hashstr.put(2 , " QUANG LONG");
        hashstr.put(3 , " QUANG TRACH");
        hashstr.put(4 , " QUANG TAN");
        System.out.println("danh sach cac xa trong hashstr: " + hashstr);
        hashstr.remove(2);
        System.out.println("danh sach cac xa trong hashstr sau khi xoa:"+ hashstr);
    }
}
