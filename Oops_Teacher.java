
    /* Object is an entity that has some state and behavior is known as object eg fruits,animals,true etc
     what is object 
     * object represent an entity
     * It is an instance of the class(physical entity)-which actually occupied the memory
     * An object has three characteristics.
     * i)state:Represents the data(value)of an object.
     * Represented by the data fields of the object with their current values also known as its properties or attributes.
     * ii)Behavier:Represent the behavior (Functionality) of an object such as deposit, withdraw etc.
     * Defined by the methods of an object, also known.as its.action.
     * iii)Identity:An object identity is typically implemented via.a unique ID.the value of ID is not visible to the external user.However,it is used internally by the JVM to identify each object uniquely
       To invoke or call a method, an object is to ask the user to perform an action
       What is class? A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can.not be physical.
       A class in Java can contain fields, methods, constructors, bloCKs, nested class and interface.
       Different ways to initialize to class variable -
       one using object (directly) 2)using constructor 3)using method
       Different type of methods inside the class
        in Java,a method is like a function which is used to expose the behavior of an object.
        methods:
        1)a methods may not take any take any parameter. 
        |2) method may take parameters. 
        |Three. A method return some values
        |four. a method may not return values.
        */
// Creating teacher class- Blueprint of teacher class
//declaration of teacher class
//syntax accessmodifier class_keyword class_name(the first letter of class name shoul always be startwith a capital letter)
public class Oops_Teacher {// the class name should be same as the file name
  // initialization
  String name,gender;// instance variable memory occupies in the heap memory when we create(initialization) a object
  int phone;//state , these are global variable
  //default value null null and 0 

// Behavier
  //3)using method
  // method to store information
   //method may take parameters. 
  // |four. a method may not return values.
  // creating a constructor
   void storeinfo_method(String n ,String g,int ph )// anysymbol between is not allowed , these are local variables
  {// the order should be same as given in the driver code
   name=n;
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
}
