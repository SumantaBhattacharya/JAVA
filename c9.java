class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print() {
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print() {
        super.Print(); // Call the Parent class's Print method
        System.out.println("Child's Print()");
    }
}

public class c9 {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}

