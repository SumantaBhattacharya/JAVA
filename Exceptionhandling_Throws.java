// part 3
public class Exceptionhandling_Throws {// class is a blueprint
    /* int add(){

    } */
    public static void main(String[] args) throws InterruptedException {//entry point of the program
// main method is controlled by JVM
// compiler --> add()-> main()-->jvm
        // throws keyword in Java
        for (int i=1 ; i<=10; i++){
        System.out.println(i);/*1 2 3 4 5 6 7 8 9 10 */ // number of processes
//initially these number were printing at the same time but when we are using .sleep(1000); this line of code will delay the process when when process 1 copletes its execution it will take 1 second to execute another process for that one second the cpu is going to idle mode
        //Thread_class
        // it is a unchecked exception

      // for unchecked exception we need to use throws keyword
      // throws: when we does not want to handle the exception we send that exception to a different method or JVM
 //it is 1000 mileseconds which is equal to 1 second
      Thread.sleep(1000);// this exception is under the main method
      //Exceptionhandling_Throws.java:8: error: unreported exception InterruptedException; must be caught or declared to be thrown
//the main method will throw the exception to JVM



    }
      
    }
}
