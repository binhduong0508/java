import java.util.ArrayList;
import java.util.Iterator;

public class trang19chuong4 {
  public static void main(String[] args) {
    ArrayList<Float> arrfloat = new ArrayList<>();
    arrfloat.add(0.7f);
    arrfloat.add(7.26f);
    arrfloat.add(1.02f);
    arrfloat.add(9.3f);
    Iterator<Float> iterator = arrfloat.iterator();
    System.out.println("cac phan tu co trong arrfloat la :");
    while (iterator.hasNext())
    System.out.println(iterator.next() + "\t");
  }  
}
