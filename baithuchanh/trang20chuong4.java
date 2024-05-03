import java.util.ArrayList;
import java.util.ListIterator;
public class trang20chuong4 {
   public static void main(String[] args) {
    ArrayList<Character> arrcha = new ArrayList<>();
    arrcha.add('a');
    arrcha.add('b');
    arrcha.add('c');
    arrcha.add('d');
   ListIterator<Character> listiteractor = arrcha.listIterator();
   System.out.println("cac phan tu trong arrchar la :");
   while(listiteractor.hasNext())
   System.out.println(listiteractor.next() + "\t");
   
   } 
}
