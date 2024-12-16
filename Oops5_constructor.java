/*There are two types of constructors.
1. default constructor in Java | 2. parameterized constructor in Java 
A constructor that has no parameters is known as default constructor
A constructor that has parameters is known as parameterized constructor. If we want to initialise fields of the class with our own values, then use a parameterized constructor*/
public class Oops5_constructor {
  
    String name,gender;// instance variable memory occupies in the heap memory when we create(initialization) a object
    int phone;//state , these are global variable
    //default value null null and 0 
  //creating a constructor which is similer to method
  // syntax - no_returntype
  // this created constructor is global
   //two parameterized constructor in Java 
    Oops5_constructor(String N , String g,int ph){// give by default value
  // code
   name=N;
   gender=g;
   phone=ph;
  
   }
//one default constructor in Java
 Oops5_constructor (){
 System.out.println("NO Value");
 }

    void display_method()
    {
      System.out.println("N:-"+name);
      System.out.println("G:-"+gender);
      System.out.println("P:-"+phone);
  
    }
    public static void main(String[] args) {
        Oops5_constructor T1=  new Oops5_constructor ("sumanta","M",883748435);
        T1.display_method();
        
        Oops5_constructor T3;
        T3= new Oops5_constructor();//no value
        T3.display_method();// default value
    }
}


