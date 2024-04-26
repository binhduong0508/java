 interface printtable {
  void print();
}
class A6 implements printtable {
   public void print() {
    System.out.println("hello");
   }
   public static void main(String[] args) {
    A6 a6 = new A6();
    a6.print();
   }
}
