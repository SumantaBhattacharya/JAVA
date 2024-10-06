
interface Calculator {
    public abstract void add();

    abstract void sub();

    default void init() {
        System.out.println("This is a default method");
    }
}

class Mycal1 implements Calculator {
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

public class A_1 {
    public static void main(String[] args) {

        Mycal1 T1 = new Mycal1();

        T1.add();
        T1.sub();

    }
}
