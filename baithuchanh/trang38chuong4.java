import java.util.LinkedList;

public class trang38chuong4 {
    public static void main(String[] args) {
        LinkedList<String> linkstr = new LinkedList<>();
        linkstr.add("java");
        linkstr.add("C");
        linkstr.add("C#");
        linkstr.add("C++");
        System.out.println("linkstr: "+linkstr);
       LinkedList<String> listA = new LinkedList<String>();
       listA.addAll(linkstr);
       System.out.println("listA: "+listA);
       LinkedList<String> listB = new LinkedList<String>();
       listB.add("java");
       listA.retainAll(listB);
       System.out.println("listA: "+listA);
       linkstr.removeAll(listB);
       System.out.println("linkstr: "+linkstr);
       for (String obj : linkstr)
       System.out.println("\t"+ obj + ",");
       System.out.println();
    }
}
