class Base {
    /* final */ public void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    @Override
    public void show() {
        System.out.println("Derived::show() called");
    }
}

public class c8 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show(); // No need for parentheses when calling a method without arguments.
    }
}
