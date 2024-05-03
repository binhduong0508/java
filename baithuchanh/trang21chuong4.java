import java.util.ArrayList;

public class trang21chuong4 {
    public static void main(String[] args) {
        ArrayList<String> reason = new ArrayList<>();
        reason.add("Xuan");
        reason.add("Ha");
        reason.add("Thu");
        reason.add("Dong");
        System.out.println(reason.get(1));
        System.out.println(reason.contains("Ha"));
        System.out.println(reason.size());
        System.out.println(reason.set(1, "Nom"));
        System.out.println(reason); 
    }
}
