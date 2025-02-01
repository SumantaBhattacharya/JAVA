/*Declaring a method in subclass(child class) which is already present in the super class(parent class) is known as method overriding.<--Single type inheritance
 need.(same name method in different class)
 Syntax-  @Override
 code reusability 
 runtime polymorphism
rules
   name, signature type(return type), parameter must be same 
2) if a method can't be inherited, then it cant be overridden.
Three) A method declaration as final or static cant be overridden.
4) constructor cannot be overridden. but it can be inherited*/
// Parent class
public class MOverRidingA_ych {
    String name;
    int age;

    void display(){
        System.out.println("Your Name:"+name);
        System.out.println("Your Age:"+age);
    }
}
