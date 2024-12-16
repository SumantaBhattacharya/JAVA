/* Setting keyword in Java, one) static variable. 2) static method. 3) static block 
we use static keyword when we want the value to be constant such as universuty which is MAKAUT
 * stack [ T1[1000] T1[2000] ]
 * heap ( 1000 memory adress[ name , id , university]<--T1.StaticK_ych )
 * heap ( 2000 memory adress[ name , id , university]<--T2.StaticK_ych )
 * 1000 memory adress --> static( university (Makaut)) <---1000 memory adress
 * advantage memory management
*/
public class StaticK_ych {
    String name;
    int id;// instace variable related to object
    static String university="MAKAUT";// static variable related to class

    //constructor
 StaticK_ych(String name,int id/*, String university*/){
  this.name=name;// creating a constructor if we dont use this keyword then compiler will be stuck and cant identify or confused between local and global variable
  this.id=id;
  //this.university=university;
 }
 // Non-static method to display information
 void display_P(){
    System.out.println("Your Name: " + name);
    System.out.println("Your ID: " + id);
   // System.out.println("Your University: " + university);

 }
 //static method 
 static void display(){// here static is optional
    System.out.println("ladies and Gentlemen, Heloo! and Welcome to my show(yeh pyar ki  kahani hai)" );
 }
// static block
static {
    // block of code
    // here only static variables can be accessed
    university="IEM";//it updated the name MAKAUT
}

 // but for non static variable we need to crate a object
 public static void main(String[] args) {/* reference variable */
    StaticK_ych T1 = new StaticK_ych ("Indranil",101);
    T1.display_P();
// static things dont need/require any object beacuse static keyword related to class
    System.out.println("University:" + StaticK_ych.university); //initially it is giving the default value of string which is null

    T1.display();//but we cannot call non static method like this 
    // here T1. is optional we can even write display(); /  StaticK_ych.display();
    
 
}

}