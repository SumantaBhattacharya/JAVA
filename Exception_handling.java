/*part 1
 * ---------------------------------Topic Covered in this Section---------------------------------------------
 * 1. Exception in Java
 * 2. Exception Hnadling in java
 * 3. Exception Handling in Keywords(try,catch,finally,throw and throws)
 * 4. Exception in Hirarchy
 * 5. Types of Exception
 * 6. Finally block in Java
 *     6.1 Use of Finally Block
 *     6.2 case 1: When an exception does not rise.
 *     6.3 case 2: When the exception rises and handled by the catch block.
 *     6.4 case 3: When the exception rises and not handled by the catch block.
 *     6.5 case 4: When the exception rises and handled by the catch block and again the exception rises 
 * 7. Multiple try and catch block 
 * 8. Multiple catch block 
 * 9. Nested try block 
 *     9.1         Syntax of nested try block
 *     9.2         Example of nested try block 
 * 10.Java Nested finally
 *     10.1        Syntax of nested finally block
 *     10.2.       Example of nested finally block 
 * 11.Java Nested catch
 *     10.1        Syntax of nested catch block
 *     10.2.       Example of nested catch block 
 * 12. final versus finally versus finalize 
 * 13.throw and throwss keyword in Java 
 * 14.Try-catch vs throws keyword in Java.
 * 15. user-defined exception Java
 *     15.1        Example of user defined exception 
 *     15.2        Example of custom exception
 * 
 * --------------------------------------Exception in Java--------------------------------------------------
 *1. What is Exception in Java
 An exception is an event, which occurs during the execution of a program, that disturb the normal flow of the program's instruction.
 Exception is a problem that arises during the execution of a program.An exception can occur for many different reasons including the following:
 -A user has entered invalid data
 -A file that needs to be opened cannot Be found.
 -A network connection has been lost in the middle of communication or the JVM has run out of memory.
Normally, program terminates abnormally after an execution is thrown.However,It is possible to handle the exception using try-catch block.

Exception handling in Java 
exception handling is a mechanism to handle runtime errors such as class node found exception, IO exception, sql exception, remote exception, Etcetera.

Advantages of exception handling
the core advantage of exception handling is to maintain the normal flow of the applicationan exception normally Disrupts the normal flow of the application that is why we use exception handling.

 let's take a scenario:
There are 10 statements in your program and there occurs an exception at statement five, rest of the code will not be executed that is statement 6 to statement 10 will not be executed.If we perform exception handling, rest of the statement will be executed.This is why we use exception handling in Java.

exception handling keywords 
there are five keywords using Java exception handling
-try
-catch
-"finally"
-throw
-and "throws"
Try block"
 the try block contains set of statements where an execution can occur.A try block is always followed by a catch block which handles the exception that occurs is associated try block.A try block must be followed by catch blocks or finally block or both.
 "
 Catch clock?
  the catch block is where you handle the exceptions, thes block must follow the try block.A single try block can have several catch blocks associated with it .you can catch different exceptions in different catch blocks .when an exception occurs in try block, the corresponding catch block that handles that Particular exception executes.For example if an arithmetic exception occurs in try block when the statements enclosed in catch block for arithmetic exception executes.
  
  * Types/categorized of Exception
 * 1.User defined Exception 
 * Check exceptions 
 * these exceptions are called compile time exceptions because this exceptions are checked at compile time by the compiler.The compiler ensures whether the programmer handles the exception or not.The programmer should have to handle the exception; otherwise, the system has shown a compilation error.
 * 2.and build in exception
 * Exception that are already available in Java libraries are referred to as build in exception.These exceptions are available to define the error situation so that we can understand the reason of getting this error it can be categorized into two broad categories that is check exception and unchecked exception.
 * Types of building exception/class
 *     5.1 Checked Exception
 *     5.2 Unchecked Exception
 * Checked Exception: are those exceptions that are identified by the compiler for example stack overflow,class not found exception, interrupt exception,I/o exception,instantiation exception,sql exception,File not found exception.these all are class,are mandatory to check these exceptions
 *  Unchecked Exception: are those exceptions that are not identified by the compiler, they are identified by the user for example Arithmetic exception,Null pointer Exception,Array index,illLegal /threat state exception (multi threading),class cast exception,array store exception.are not mandatory to check these exceptions
 The unchecked exceptions are just opposite to the Check exception the compiler will not check the exceptions at compile time in simpler words if a program throws an unchecked exception and even if we Didn't handle or declare it, the program would not give a compilation error., it occurs when the user provides bad data during the interaction with the program.
 In checked exception the class_name.java file will not be able to create class_name.class,compilation will be stopped,compilation return to the program and rise compile time exception
 In Unchecked exception the class_name.java file will be able to create class_name.class.It will not rise to any compile time exception but at the moment of execution it will rise a runtime error that is called exception
 note: the runtime exception class is able to resolve all the unchecked exception because of the child parent relationship.

 1.Debugging = Finding out the errors of the code
 2.Code      = Adding errors into the code
 3.Errors    = i) Compile Time error.(syntax mistakes) ii) Run Time error.(arrise during user input) iii) Logical error.(Not expected output)
 
 Basically exception is a thing that ignores the error when it encountered during its execution in a code and goes to the next line of codes it didn't get terminated when it encountered The line that has errors detected by the compiler it just simply execute the next lines of the code
 exception is a abnormal situation of a program

 Exception and errors are (child)classes come under throwable class
  Exception
 runtime exception comes under exception
 Arithmetic exception comes under runtime exception
 Null pointer
 Number format
 Index not found exception
 Array index and string index comes under index not found exception
 2.I/o Exception
 i. EOF(End of file) Exception
 ii. file not found exception
 3.SQL exception( sql query)
 4.interrupt exception
 5.class not found exception
errors
 stack overflow comes under error
 Out of memory
 I/O error
 linkage error

 javac is the actual compiler that compiles the source code (at the moment of compiling your source code that moment if any error occur then that is known as compiler time error and it return back to file  class_name.java ).
 if it is successfully compiler then it will generate class_name.class file,javac convert the souce code into byte code i.e machine code
 AFTER successfully compilation of this file class_name.java then this file will be execute by JVM , during execution if any errors arise then it is simply called Exception(/runtime error)
 
I/o exception are mandatory to done under the try and catch block
I/o exception can be rise up when we are working with I/o files
The program will never run if in the build in exception and under the check exception classnotfoundexception is occurred,it will say a rise up to main method is not found in the class

How to resolve the error the exceptions occur in the main method.And get rid from this compilation errors by declaring the exception in the mean method using the throws we can only declare the IO exception, not filenotfoundexception because of the child parent relationship.The IO exception class is the parent class of a file so this exception will automatically cover by IO exception.
We can also handle these exceptions using try catch We have to give meaningful message For each exception type by doing that it would be easy to understand the error we will use try catch block in the following way.

*/
//process
public class Exception_handling {// p1

    public static void main(String[] args) {// p2
        // types of exception
        // arithmetic exception

        // int a=20,b=0;//it is successfully compiled. Compiler genarated an
        // Exception_handling.class file --Abnormal situation that is occured in run
        // time execution and thrown a exception
        // int c=a/b;/* Exception in thread "main" java.lang.ArithmeticException: / by
        // zero //ArithmeticException is a build in class under Exception
        // class.ArithmeticException stays under a package i.e lang package and this
        // lang package(It is a sub package)(lang for language) stays under java
        // package(main package).ArithmeticException is a build in class you can clearly
        // see the first letter is capital(A).
        // at Exception_handling.main(Exception_handling.java:117*/
        // System.out.println(c);// why it is happen because / by zero
        // System.out.println("Hello, World!");

        // String s = null;//Null pointer exception
        // System.out.println(s.length());/*Exception in thread "main"
        // java.lang.NullPointerException: Cannot invoke "String.length()" because
        // "<local3>" is null
        // at Exception_handling.main(Exception_handling.java:125) */ // it is a build in exception
        // run time error 

        // String i = "India";
        // int I = Integer.parseInt(i);
        // System.out.println(I);/*Exception in thread "main"
        // java.lang.NumberFormatException: For input string: "India" */
        // System.out.println(i.length());

        // String n = "12345";//we mean by this code is that when we perform the same
        // operation with the alphabet letters it shown us a error but when perform the
        // same operation with the number under double quotation which considered as
        // string it showing us the espected output
        // int N = Integer.parseInt(n);//conversion
        // System.out.println(N);//string converted into integer withcausing the
        // java.lang.NumberFormatException:
        // System.out.println(n.length());
        /*
         * 12345
         * 5
         */

      //  int arr[] = { 68, 69, 86, 96, 104 };// array ExceptionoutofBounds
      //  System.out.println(arr[9]);/*
    //                             * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9
    //                             * out of bounds for length 5
    //                             * at Exception_handling.main(Exception_handling.java:142)

        /* Mechanism of handling all types of Exception in java */
        /*
         * try and catch block
         * syntax---
         * try{
         * // exception body
         * }catch(Exception e (prebuindclass reference)){
         * //display message after handling the exception
         * sout(e)
         * }
         * 
         */

        int a = 20;
        int b = 0;// it is successfully compiled. Compiler genarated an Exception_handling.class
                  // file --Abnormal situation that is occured in run time execution and thrown a
                  // exception
        try {// try:you have to handle the exception or detect the exception
            int c = a / b;// try detect the exception
            System.out.println(c);//ArithmeticException
        } // catch(Exception e )<----(prebuind_class reference)
        catch (Exception e) {// this part of code will only execute when an exception will be detect in the
            // fourth mathods to print the exception 1 print the exception more detaildfully and 2 methods i.e sout print just the name of exception and 3rd method i/e another sout just print the cause of exception and the last one sout method containing our custom message
            e.printStackTrace();//java.lang.ArithmeticException: / by zero
           // at Exception_handling.main(Exception_handling.java:188)
            System.out.println(e);//java.lang.ArithmeticException: / by zero
           System.out.println(e.getMessage()); 
           System.out.println("Cannot devided by Zero");

           // providing the solution
           System.out.println(a/(b+2));//20/0+2=10
        }
        System.out.println("Don't escape from reality");// this line still executed aften getting an exception thats why we us e try and catch block in exception handling
    
    // NULL POINTER EXCEPTION
        try{//try is not a keyword it is a block
         String s = null;//Null pointer exception
         System.out.println(s.length());//Exception is a super class under throwable
         }
         catch(Exception exception){//NullPointerException is a prebuild class
            System.out.println(exception);
            exception.printStackTrace();
         }
         System.out.println("Hello!");   
         

         try{
            String i = "India";
         int I = Integer.parseInt(i);
         System.out.println(I);
         }catch(Exception ex){//catch is not a keyword it is a block
            System.out.println(ex.getMessage()); 
         }
          System.out.println("I just want someone to hug wholeheartedly ♥");

        //int arr[] = { 68, 69, 86, 96, 104 };// array ExceptionoutofBounds
        try{
         int arr[] = { 68, 69, 86, 96, 104 };// array ExceptionoutofBounds
         System.out.println(arr[9]);}//exception starts from here
         catch(ArrayIndexOutOfBoundsException excep){// it will only execute if there is only exception
         excep.printStackTrace();
        System.out.println("Array index is out of bound");}
        System.out.println("I be sooner or later dead why live fearfully I want to my life my hear content");
/*  finally is not a keyword, we cannot use it in methods, contructors etc. 
finally { 

}
finally block genarally use for Resouce handling
it will execute surely

finally flowchart
(start)--->[try]---><exception--NO-->[ignore catch block]-->[finally block execute]-->(end)
                             |--YES-->[ignore the rest of the code]-->[excute catch]-->[finally block execute]-->(end)

                             */ 
// finally block
try{
    System.out.println("Can you be my lover till the very end");
    int x = 20;
    int y = 0;
    int k=x/y;
    System.out.println(k);
    System.out.println("To the girl I don't know I have yet fortunate enough to meet or not");// this line is not executing because int k=x/y; this line is throwing an exception and then the control goes to the catch block 
}catch(ArithmeticException eArithmeticException){
    eArithmeticException.printStackTrace();
}finally{
    System.out.println("Dying out very seconds");// this line will execute either the exception comes or not!
}
System.out.println("Whenever you feel like coming into my life please bring some butterflies in the stomach");

// multile try catch
        int m = 69;
        int n = 0;
        try {
            int o = m / n;
            System.out.println(o);
        } 
        catch (Exception eAException) {
            System.out.println(eAException);
           System.out.println(eAException.getMessage());  }
        try{
         int arr[] = { 140, 401, 10, 14, 104 };
         System.out.println(arr[9]);}
         catch(ArrayIndexOutOfBoundsException eArrayIndexOutOfBoundsException){
         eArrayIndexOutOfBoundsException.printStackTrace();
         System.out.println("Array is out of bound");}
         System.out.println("Atleast I am not cheap enough to rush in your life♡");

    //Multiple catch block
    int j = 69;
    int g = 3;
    try{// here we cannot prinit all the exception messages
        int result = j / g;
        System.out.println(result);

        int ar[] = { 420, 402, 20, 4, 40 };
        System.out.println(ar[2]);

        String Strings = null;
        System.out.println(Strings.length());
    }
    catch(ArrayIndexOutOfBoundsException exception)
    {
        exception.printStackTrace();
 
    }
    catch(ArithmeticException AException){
        AException.printStackTrace();
    }catch(Exception Except){
        Except.printStackTrace();
    }
    System.out.println("It should be like whenever I see you my heart should pound at high speed");

    // Nested try Block
    //syntac
    /*
     * try{          // outer try and catch block for high risk exception
     * st.1;        //no exception  if this line has exception then the inner try and catch block will not execute 
     * try{        //inner try and catch for high risk exception
     * }catch(){
     * }
     * }catch (){   //outer catch block
     * }
     */
// the combination of outer and inner try and catch block is called Nested try Block in java
     try{
        System.out.println(420/2);//low risk  if this line has exception then the inner try and catch block will not execute 
        try{
            int ar[]={1,2,3};
            System.out.println(ar[2]);

            try{
        String String_s = null;
        System.out.println(String_s.length());}
        catch(NullPointerException npe){
            npe.printStackTrace();

        }


        }catch(ArrayIndexOutOfBoundsException AIException){
            AIException.printStackTrace();

        }
        
     
     }
     catch(ArithmeticException Aexception){
        Aexception.printStackTrace();

     }
     
     System.out.println("Maybe someone hasn't been close enough to love me");

// Nested catch
// Nested catch can print multiple exception messages at once
    try{
        System.out.println(10/0);//if the first statement does have any exception then the other satements will not execute and if the first statement has exception then the other statements will raise an exception
    }catch(Exception Exception_s){
         System.out.println(Exception_s.getMessage()); 
        try{
            String Strings_s = null;
        System.out.println(Strings_s.toLowerCase());}
        catch(NullPointerException npE){
            System.out.println(npE);
            
            try{
            double ar[]={6.9,9.6,69.69};
            System.out.println(ar[9]);


            }catch(ArrayIndexOutOfBoundsException AIOutOfBoundsException){
                AIOutOfBoundsException.printStackTrace();



            }

        }


    }
    System.out.println("Maybe I look sad all the time but I am way happier than ever was ");

// Nested finally
// it will execute all finally satements whether the try block has exception or not
try{//use to implicitly tell the JVM(Java Virtual Machine.) that it is a exception 
    String message="MAYbe i look younger but i am too old from inside";
    System.out.println(message.toUpperCase());


}catch(Exception S_Exception){// reference
    S_Exception.printStackTrace();

}finally{
    try{
        System.out.println(78/0);

    }catch(ArithmeticException Arithmetic_Exception){//ArithmeticException is a part of runtime exception and run time exception is a part of Exception and Exception is subclass  or a part of throwable and throwable is a part of Serializable
        Arithmetic_Exception.printStackTrace();

    }finally{
        System.out.println("Stay with mum, earn money that's rizzz");

        try{
            String arr[]={"the","sad","reality","is","you","are","not","mine","never","was","actually"};
            System.out.println(arr[1]);

        }catch(ArrayIndexOutOfBoundsException arr_Exception){//prebuild or inbuild exception
            arr_Exception.printStackTrace();

        }finally{
            System.out.println("I just want someone to hug wholeheartedly\n");

        }

    }
}
System.out.println("Woh hasina bhe kya Jo rat ko samne na aye \n" + //
        "Woh hasina bhe kya Jo rat ko samne na aye \n" + //
        "Woh bete lamhe tadap Jaye lekin useki hase se Dil bhar Jaye");

/*12. final versus finally versus finalize 

final is a keyword that we can use with variable , methods and class
we cannot reinitialise if we use final before any varibale that become constant
if there is final keyword beofre method then we say it as final method
and.. we cannot override the final method
if we use final keyword before any class then we say it as final class
final class cannot be inherited in java
 
finally is a block that we use it with try and catch block to print a message whether exception occurs or not 
used for resource handling

finalize is a method 
helps us deallocate the allocated resources
he finalize() method is a protected method in Java that allows an object to perform cleanup operations before the garbage collector destroys it. 
 */

for (int i=1 ; i<=10; i++){
    System.out.println(i);/*1 2 3 4 5 6 7 8 9 10 */ // number of processes
//initially these number were printing at the same time but when we are using .sleep(1000); this line of code will delay the process when when process 1 copletes its execution it will take 1 second to execute another process for that one second the cpu is going to idle mode
    //Thread_class
    // it is a unchecked exception
   try{Thread.sleep(1000);}
   catch(Exception E_e){
   E_e.printStackTrace();}}

}
}
