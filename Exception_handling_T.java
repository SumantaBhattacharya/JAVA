//part 2
/* 13.throw and throws keyword in Java
 * both are not block
 * both are not methods 
 * 14.Try-catch vs throws keyword in Java.
 * 15. user-defined exception Java
 *     15.1        Example of user defined exception 
 *     15.2        Example of custom exception  */
public class Exception_handling_T {// 
    public static void main(String[] args) {
     //   throw keyword in Java
       System.out.println(69/0);
       // by using throw keyword 
       // throw: throw keyword is use to explicitly tell the JVM(Java Virtual Machine.) that it is a exception
       //we have to create the instance of a object
       // syntax:-
       // throw(throw_keyword) new(creating_the_instance_of_a_object) Exception_name();
       throw new ArithmeticException("/ by zero \n");//it is a user defined constructor/exception
       // inside the curcular bracket we can only pass the String/character value
       // it will not print/read the lines of codes written after the exception

      
    }
}
