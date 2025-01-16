//1
/*      instace variable     methods                                    class
     [  name(string)                                         ]   
     [  speed(int)       move(speed,direction)               ] Vechicle(Super/parent class)
     [  Direction(int)         stear(direction)              ] 

     [  wheels(int)                                          ]   
     [  type(String)     changeGear(changegear)              ] Car(Sub child class)
     [  Doors(int)       currentSpeed(speed,direction)       ] 
     [  gears(int)                                           ]
     [  isManual(boolean)                                    ]
   
     [           [Accelarate(rate)]                          ] Maruti (child class)

    Multilevel Inheritance
    /*Multi level inheritance:Refer to a child and parent relationship where super clild class extends to child class.
Child one behave as a subclass for parent super class. and behave as a super class for this subclass child 2 
 * parent/super class(animal)(superclass) -->(sub-class)child1(dog)(super sub class)--> child2(labrador)(sub-class)
     
 There are 2 types of Programming languages high level language and low level language 
low level programming language Types one machine language 2 assembly language
Machine language is a lower level programming language which is compiled of binary digits 1to0 machine language is not human readable
Machine language execution time is very fast
Assembly language is a low level programming language which is human readable and execution time is slow
Assembly language converts into machine language by the assembler and then execute
We use numbers symbols to write assembly languageMachine language and assembly language are both machine and hardware dependent
High level programming language examples C plus plus C programming Java JavaScript Python
hll language is a human readable high level language is execution time is slow
High level language is machine and hardware independent
 high level language converts into machine languageby the compiler or interpreter and then execute
Keywords are reserved words whose meaning is already defined by the compiler example integer float char
Compiler is a software program that converts high level source code into low level object code
Compiler scans the entire programme at once
comPiler based programming languages are C&C plus plus
Interpreter is a software program that converts high level source code into intermediate code intermediate code is used to translate source code into machine code and then convert it into machine code 
interpreter scans line by line statement of a program
Interpreted the execution time is slow and interpreter based programming languages are JavaScript Python
Comments are used to write something which The programmer does not want to execute completely ignored by the compiler comments are non executable by the compiler
datatype type is a classification that specifies which type of value in variable has and what type of operation can be applied to it without causing an error
the data that are declared within class are called data members 
the function that are declared within the class are called member function
linear data structure is a data structure representing linear relationship
data abstraction is a process of representing essential features without including the background details
,Database is a collection of Inter relation data items stored together to serve multiple operations
 database functions are database ensure security of data 2 database facilitates sharing of data 
 data types are primitive and non primitive types they can store only one type of data primitive data type examples are floatingpoint integer char aboolean 
non primitive data type is a collection where we can store more than one type of data non primitive data type examples are array string class
Numeric data types in Python numeric data types represent the data type which has numerical values numerical value can be integer floating or even complex numbers zero is neither positive nor negative integer
All positive numbers are included in set of natural numbers
 all positive numbers and zero are included in set of whole numbers 
natural numbers are start from one 
whole numbers are start from zero
Note a value which has a decimal point is called floating point. It is a real number
Integer means a whole number. This value is represented in Python int it contains positive and negative whole numbers
A string is basically a sequence of one or more charactersenclosed in a single quotation or double quotation and triple quotation
In double quotes string we can include single quote but we cannot include double quote we can include single quote in double code string in the middle
in triple quote string we can include multiple lines string which is not possible in a single or double quotes string even we can include single or double quote in it
The value of boolean are always true or false 
boolean data type is one of the build in data type

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
Encapsulation in Java is a process of wrapping code and data together in a single unit(class). For example,a capsule(class) which is mixed of several medicines(data and variables).
 How to achieve encapsulation in java?
1.packaging a variables and methods into a single unit
punlic class A{
    String name;
    int age ;
    void m(){
    }
    void (){    
    }
} 

2. protecting data by declaring them as private.
Private data will be hidden from other classes, and they can only be accessed through the methods of their current class. This is known as data hiding.
here we need to private the instance variables
Public class A {
    Private String name;
    Private int age;
    void m(){

    }
    void s(){

    }
}
  setter - information store , getter - information print(value return)

Q)How to do encapsulation in java?
one) declare the variables as private.
two) provides public(access modier) setter and getter method to modify and get the variables value 
advantages/benifits/cons:-
1) data hiding
two) Code reusability. 
Three) code can be modified without breaking the code
four) maintainability.

getters and setters method in Java.
Getters and setters are methods that allow access to private variables in a class. getters are used to get the value of a private variable,while setters are used to set the value of a private variable.
 Here is an example of a getter:
 in case of getter, we dont need to use any parameters
public string getName(){
    return name;
}
this getter method gets the value of the name private variable.

here is a example of setter
puplic void setName(String name){
    this.name=name;
}
This setter method sets the value of the name private variable    
*/  

public class Vechicle {
   private String name;//Variable is the name of memory location where we can store different types of values such as username biodata Etc| a variable name should start with a uppercase or lowercase alphabet|a variable name cant start with a number or with a symbol except underscore(_) | no widespace and symbol is allowed in between the variable | keyword names cannnot be used as variable  
   private int currentSpeed;// instance variable
   private int currentDirection;// global variable
 // Constructor to initialize the vehicle
    public Vechicle(String name, int currentSpeed, int currentDirection) {// public is default
       this.name = name;// creating a constructor if we dont use this keyword then compiler will be stuck and cant identify or confused between local and global variable
       this.currentSpeed = currentSpeed;
       this.currentDirection = currentDirection;
    }
// method to create stear creating In object-oriented programming languages like Java, a method is a function 
    public void stear(int direction){//Local Variable
    this.currentDirection=direction;
    System.out.println("stear method called. Stearing at"+currentDirection+" digrees");
    }
   
    // move function
    public void move (int speed , int direction){
    currentSpeed=speed;
    currentDirection=direction;
    System.out.println("Move method called: Moving at "+currentSpeed+" in direction"+currentDirection);
    }
// getter and setter for all the above private variables
 //syntax- access_modifier (void)return_type setName(data_type variable_name)(parameter)(method)
    public String getName() { // beause we want to return name which is string so we are using String as datatype in getter method
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    public int getCurrentDirection() {
        return currentDirection;
    }
    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
    // method to mention the stop of the vechicle 
    // if speed value is 0 then the car its stop
    public void stop(){
        this.currentSpeed=0;
        System.out.println("Vechicle is now stopped");
    }
}
