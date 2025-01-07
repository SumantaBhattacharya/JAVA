public class ThisK_ych {
/* This keyword in Java 
methods to use 'this' in java
1 using the' this' keyword to refer to current class instance variables.
2. using 'this() 'keyword to invoke the current class constructor.
3. using this to call the current class method. */
String name;// instance variable
int age;// global variable
String favcolour;
// creating a constructor if we dont use this keyword then compiler will be stuck and cant identify or confused between local and instance variable
ThisK_ych(String name,int age){
    this.name=name;// local variable
    this.age=age;
}
ThisK_ych(String name,int age,String favcolour){
    this(name, age);// it reduces the need to write this keword for which this keyword is already used but it can be used for only 1 constructor
    this.favcolour=favcolour;
}

// creating a method
void display(){
    System.out.println("Name:"+name);
    System.out.println("age:"+age);
     System.out.println("favcolour:"+favcolour);
}
void display_P(){
    this.display();
   System.out.println("You are my Lover");
   System.out.println("I am Loving It");
}
public static void main(String[] args) {
    ThisK_ych T1= new ThisK_ych("sumanta", 995706630,"white");
    T1.display();
    ThisK_ych T2= new ThisK_ych("suman", 885706630,"Black");
    T2.display();
    T2.display_P();
}
}
