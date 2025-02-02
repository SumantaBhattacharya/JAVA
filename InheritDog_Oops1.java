/*
Inheritance in Java is a Mechanism in which one object acquires all the properties and behaviors of a parent object.It is an important part of oops.
 * The idea behind inheritance in Java is that you can create new classes that are built upon existing classes .When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and feels in your current class Also.
 * Inheritance represent the IS-A Relationship, which is also known as a parent child relationship
 * Need of inheritance in Java.
 * One) code reusability:the code written in the superclass is common to all sub classes. Child classes can directly use the parent class code. 
 *  Method overriding:Method overriding Is acheviable only through inheritance.It is one of the ways by which Java achieves runtime polymorphism.
 * Abstraction:The concept of abstract, where we do not have to provide all the details through inheritance. abstraction, only shows the functionality to the user.

Inheritance in Java important terminologies used in Java inheritance.
class:class is a set of object with shares common characteristics or behavior, and common properties are attributes.Glass is not a real world entity.It is just a template or blueprint or prototype from which objects are created.
Super class or parent class:The class, whose features are inherited, is known as a superclass or a base class or a parent class
Surplus or child class: The class that inherits the other class is known as a subclass or a derived classor extended class, or child class.The subclass can add its own fields and methods  In addition to the subclass fields and methods.
Extends keyword:nothing but a keyword, which indicates that a class derived from an existing class

Single inheritance refers to a child and a parent class relationship where the class extends to another class. This involves only two class when 1 is parent and another one is child class.

*/
// child
public class InheritDog_Oops1 extends InheritA_Oops2 { // now this class is ready to inherit any other class 
   String colour;
   String breed;
   String name;

 public void wagTail(){
    System.out.println("dog usually wag their tail");
 }
 public void Bark(){
    System.out.println("dog barking is a sigh of hes anger");
 }
 public void eat(){
    System.out.println("dog like to eat bones");
 }
}