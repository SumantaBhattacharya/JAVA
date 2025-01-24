/*
* 3. Abstraction  i) Abstract Method and class.                                                   ii) Interface.  <-- incomplite information

 Interface<> in Java:- contract paper 
 all the methods present in the interface shoud be implimented in the other classes.we can make change in the method body of different classes but the name of the methods should be same as in the interface.
 Interface is not a class!
 Interfaces are never intanciated.Interface we cannot create object
 Interface is an abstract class
 * java was launched in May 1995.
 * Java was originally developed by James Gosling at Sun Microsystems.

 * with c language programming with can never do object oriented programming language and we can never connect connect it with the data base systems
   
 Front end---><---Backend---><---Database
 
 JDBC(java data base connection)
 
 
 */

 // interface
 // syntax interface Interfaceclass_name(it is different than normal class)(Interfaceclass_name cannot be as same as the class_name)(Interfaceclass_name cannot create object){}

import java.util.Scanner;

interface Calculator{//The error message you're seeing is because Java expects an interface with the public access modifier to be declared in a file with the same name as the interface. Create a file named Calculator.java and define the Calculator interface in it:Create another file named Abstrac_Interface_Ych2.java and define your main class in it
   public abstract void add();// the above comment basically says that if you add public with/beofre interface Interfaceclass_name and  in that single file you have defined the main class then it will show us en error to remove this error what we can do is create two different files to put public before interface interface_classname 
   abstract void sub();//here the public abstract is complitely default we can provide it but it doesnt need to,we cannot write private instead of public beacuse in future we have to override if we keep it private it would not be able to override it in the next class                                       //  interface provide abstract class method by default without using abstract keyword, here we cannot create the body of the method, interface abstract class doesnt provide that
   
   default void init(){ // we use this we we dont want it every class but in our selected class
   System.out.println("This is a default method");}
}
// inside interface we can never create constructor

 //creating class by implimenting interface, class name should always be capital
// Create a class Mycal1 that implements the Calculator interface
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

// my calculator 2
// Create another class Mycal2 that also implements the Calculator interface
class Mycal2 implements  Calculator {

    @Override
    public void add() {// it is public because interface is public
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        
        if( b==0){
         System.out.println("anything plus by zero gives same number");}
         else{
        
        int c = a + b;
        System.out.println("Addition result in Mycal2: " + c);}
    }
/*     if( b==0){
         System.out.println("anything plus by zero gives same number");
        }
        int c = a + b; // provide both the output
        System.out.println("Addition result in Mycal2: " + c); */
    @Override
    public void sub() {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        if (b==0 || a==0){
         System.out.println("anything minus by zero gives the same number");
        }
        int c = a - b;
        System.out.println("Subtraction result in Mycal2: " + c);
    }
}
 // we can use the interface_classname as the reference variable
class Maths {// never make a class name 'Math' it will create an error in all the files
    void permit( Calculator referenceCalculator) {
        referenceCalculator.add();
        referenceCalculator.sub();
    }
}

public class Abstrac_Interface_Ych2 {
    public static void main(String[] args) {
        // Create instances of Mycal1 and Mycal2
        Mycal1 T1 = new Mycal1();
        Mycal2 T2 = new Mycal2();
        
        // Call the add and sub methods for both classes
       /*  T1.add();
        T1.sub();
        T2.add();
        T2.sub();*/
        

      //sc.close() 
     // Create an instance of Maths and call the permit method with T1  
   /*   Maths m = new Maths();
     m.permit(T2);
     m.permit(T1);*/

// we can use the interface_classname as the reference variable
      Calculator cal1 =new Mycal1();
     cal1.init();//This is a default method
     cal1.add();/*Addition result in Mycal1: 15
              Subtraction result in Mycal1:-3 */
     cal1.sub();

     Calculator cal2 =new Mycal2();
    cal1.init();
    cal2.add();
    cal2.sub();
          // Close the Scanner object
        // Create a new Scanner object for closing the resource
//sc.close();
    }
}