class Base {
    public void foo() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    @Override
    /*private*/public void foo() {// in the exam it was given private instead of public
        System.out.println("Derived");
    }
}

public class c11 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.foo();
    }
}
