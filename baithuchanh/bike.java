 abstract public class bike {
abstract void run() ;
}
class honda extends bike {
void run(){
    System.out.println("running salely...");
}
public static void main(String[] args) {
    bike bk = new honda();
    bk.run();
}
}