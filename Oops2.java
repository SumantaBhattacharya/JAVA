public class Oops2{// it needs to be having 
    //Driver code
  public static void main(String[] args) {// main method- execution starts from here
    // declare the object
    //filename object_name;
    // compile time allocation - Hyper Level Language TO Machine Level language
      Oops_Teacher T1 ; // reference variable memory occupies in stack memory
      // initialisation or memory allocation
      //reference_variable= new_keyword class_name(constructor) ();
    //instance of the class
    // run time allocation jvm using this new keyword creating a object in the heaps memory and storing the reference into the T1 variable stored in stack memory
      T1 = new Oops_Teacher();// complitation of memory allocation, it will point to a individual object
   // fuction call
   // we initialized value through function
      T1.storeinfo_method(
     "Sumanta",//accessing the attributes
     "Male",
     813386215);// WE NEED TO STORE THE INFIRMATION AT THE ARGUMENT

    
      //3)using method
      // display the values
      T1.display_method();
    // Object created having the features of class oops _teacher Each object creating a separate memory, having the same blueprint
     Oops_Teacher T2 = new Oops_Teacher();//it will point to a individual object
     // like classes and objects
      //one using object (directly) assign value
     T2.name="Suman";//accessing the attributes
     T2.gender="Female";// '.' is the member operator
     T2.phone=883749435;// it can only take 9 digits
      // display the values
     System.out.println("name:-"+T2.name);
     System.out.println(T2.gender);
     System.out.println(T2.phone);

   }
  }
