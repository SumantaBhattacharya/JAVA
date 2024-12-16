/*
      * Constructor in Java.
constructor is a special kind of method which will have the same name as the class name and this constructor will automatically called or invoked at the time of object creation.
Properties of constructors.
Constructor will not return any value.It has no return type.not even void
Constructor will take the parameter's just like methods.

comparison
compiler(jvm) never calls a method but user need to call a method.constructor will automatically called or invoked at the time of object creation.
methods name are custom made but constructors name shoud be same as class name

Syntax of constructor.
class_name () {

}

      */
public class Oops3_constructor {
  
     
     // initialization
  String name,gender;// instance variable memory occupies in the heap memory when we create(initialization) a object
  int phone;//state , these are global variable
  //default value null null and 0 

// Behavier
  //3)using method
  // method to store information
   //method may take parameters. 
  // four. a method may not return values.
//creating a constructor which is similer to method
// syntax - no_returntype
// this created constructor is global
  Oops3_constructor(String N , String g,int ph){// give by default value
// code
 name=N;
 gender=g;
 phone=ph;

 }
  // method to display information
  // 1)a methods may not take any take any parameter.
  //|four. a method may not return values. 
  void display_method()
  {
    System.out.println("N:-"+name);
    System.out.println("G:-"+gender);
    System.out.println("P:-"+phone);

  }
   //Driver code
   public static void main(String[] args) {// main method- execution starts from here
    // declare the object
    //filename object_name;
    // compile time allocation - Hyper Level Language TO Machine Level language
      Oops3_constructor T1 ; // reference variable memory occupies in stack memory
      // initialisation or memory allocation
      //reference_variable= new_keyword class_name(constructor) ();
  
    // run time allocation jvm using this new keyword creating a object in the heaps memory and storing the reference into the T1 variable stored in stack memory
    // At the time of creating the object if we want to initialize value directly we need constructor.
    // calling the constructor
    // instance of the class 
    // this will store in the constructor
    // these are local variable its range limited to its constructor
    T1 = new Oops3_constructor("Sumanta","Male",813386215);// complitation of memory allocation, it will point to a individual object

      //3)using method
      // display the values
      // now we define this constructor class
    T1.display_method();
    // Object created having the features of class oops _teacher Each object creating a separate memory, having the same blueprint
  

   
   }
}

   





