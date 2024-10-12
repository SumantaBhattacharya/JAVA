class T {
    int t = 20;
    T() {
        t = 40;
    }


void display() {
        System.out.println("Value of t: " + t);
    }

}
public class c7 {
    public static void main(String[] args) {
        T t1 = new T();
        t1.display();
        System.out.println(t1.t);
    }
}

/*
 Initial Value Assignment:

When an object of class T is created (T t1 = new T();), the instance variable t is initially set to 20 as per the declaration (int t = 20;).
Constructor Call:

Immediately after the instance is created, the constructor T() is called. Inside the constructor, the instance variable t is updated to 40 (t = 40;).
This means the previous value of t (which was 20) is overwritten by 40 when the constructor is executed.
 */