interface Calculator{
   public abstract void add();
   abstract void sub();
}
class Mycal1 implements  Calculator {
    @Override
    public void add() {
        int a = 6;
        int b = 9;
        int c = a + b;
        System.out.println("Addition result in Mycal1: " + c);
    }

    @Override
    public void sub() {
        int a = 6;
        int b = 9;
        int c = a - b;
        System.out.println("Subtraction result in Mycal1:" + c);
    }
}

public class A{
    public static void main(String[] args) {
      Calculator cal1 =new Mycal1();
      cal1.add();
      cal1.sub();

    }
}
