/*

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

public class Encap_Oops {
    private String name ;// instance variable
    private int age ;
        // setter of name 
    //syntax- access_modifier (void)return_type setName(data_type variable_name)(parameter)(method)
    public void setName(String name){// class global and local variable name are same thats why we use 'this' keyword
        this.name=name;// local variable / parameter name
    }

    // getter age
    // beause we want to return name which is string so we are using String as datatype in getter method
    public String getName(){
        return name;
    }

     public void setAge(int age){// class global and local variable name are same thats why we use 'this' keyword
        this.age=age;// local variable / parameter name
    }

    // getter age
    // beause we want to return age which is string so we are using String as datatype in getter method
    public int getAge(){
        return age;
    }

    // display method
    void display (){
        System.out.println("Your Name :"+name);
        System.out.println("Age:-"+age);
    }
 
}