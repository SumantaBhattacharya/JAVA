// chnages in the method body <-- method Overridden
/* Can we override main method in java? No, we cannot override the man method in Java. The main methodis a static method and static methods cannot be overwritten in Java 
 * The main method is a special method in Java that acts as an entry point for running any Java programme. It always has the same syntax that is, public, static void main(String [] args)
  We can overload the main method in Java, but jvm will always call the original main method ,It will never call overloaded main method*/
public class MOverRidingB_ych extends MOverRidingA_ych {

    String  Qualification;
// information update
    @Override// it is optional

    void display() {
      //  super.display(); // Calls the parent class's display method
      System.out.println("Your Name:"+name);
      System.out.println("Your Age:"+age);
      System.out.println("Your Qualification:" + Qualification);
    }
}
