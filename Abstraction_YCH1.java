/* 
 Oops(Object oriented programming language) core principle
 * 1. Inheritance 
 * 2. Polymorphism i) Method Overloading.                                                          ii)Method Overriding. "Greek word"- "Poly"(Multiples)+"Morph"('morphe' meaning form) advantage code reusability ii) improve code efficiency and look more efficient  iii)code optimize iv) increase code readability
 *    type         i) Compile type polymorphism OR Static type polymorphism.[ Method Overloading ] ii) Run type polymorphism or Dynamic type polymorphism. [ Method Overriding, rules- Inheritace applicable ]
 * 3. Abstraction  i) Abstract Method and class.                                                   ii) Interface.  <-- incomplite information
 * 4. Encapsulation
  
 * Q)Can We overload the method by just changing the return type
 *   NO, we cannot. It will give us compile time error due to ambiguity problem.
    We only impliment overloading, When we make changes in the paremeters of the method

  Q)what happen when we change the signature part of the method at the time of overriding
    We cannot override any method with changes with the signature part java does not provide these facility it will result into complie time error
    thus we cannot change the signature part of the method, the signature part of the method is always similer to the method which you override present in the super class
    if we want to override the method the write the signature part as same as the super class, we are only to change the body part of the method  

what is Abstraction in java?
 definition- Abstraction is the process of hiding certain details and showing only essential information to the user. 

 Observations
 An instance of a abstract class cannot be created for example Eagle T3=new Eagle(); but we can create reference of the abstract class Eagle e = new serpentEagle();
 We can have an abstract class without any abstract method but
 if a class contains atleats one abstract method then compusury shoud be declre a class as abstract
 constructors are allowed
 v)There can be a final method in abstract class, but any abstract method in class that is abstract class cannot be declared as final or in simpler terms. Final method cannot be abstract itself as it will yield an errorIllegal combination of modifiers:abstract and final
 vi)We can define static method in abstract class
 vIi) if the child class is unable toprovide implementation to all abstract methods of the parent class then we should declare that child class as abstract so that the next level child class should provide the implementation to the remaining abstract method

windows + G to see the fps and gps

method which doesnt have a body is called abstract method

abstraction is done before class*/
abstract class  Bird{
    abstract void eat();//{}
    abstract void fly();
}// as we can see abstract method is little different than the normal method cause it doesnt contain curly brackets instead it contain a semi colon and rest of the things are same except it need to write abstract before to make it an abstract method

abstract class Eagle extends Bird{//as we see that the bird is an abstract class and we the eagle class inheriting the bird class which is abstract class so we need to put abstract before to eagle to inhert the properties of abstract bird class only a abstract class can inherit another abstract class     
    //constructors are allowed
    Eagle(){
        System.out.println("This is a eagle constructor");
    }

    @Override
    void fly(){
        System.out.println("Eagles are very furious birds that can fly over the height of Mountains");
    }
}

class serpentEagle extends Eagle{
    @Override
    void eat() {
        
        System.out.println("serpent eagle are hunting birds that hunts serpents");
    }
}
class GoldenEagle extends Eagle{
    @Override
    void eat() {    
        System.out.println("\n golden eagle fly around over sea and consider fish as for their living essentialities ");
    }
}

// We can have an abstract class without any abstract method but we cannot having abstract method without an abstract class
 abstract class Test{//vi)We can define static method in abstract class but we cannot define static method with the abstract method
    static void greetings(){//v) we cannot put final keyword before an abstract method it not not applicable because then we cannot override it.
        System.out.println("HEll O  Dear ladies and Womens Wecome to You all♡ ");
    }
    final void Introduction(){
        System.out.println("I am host for today's program I hope this Night will be remain in Your Heart🖤");
    }
}

public class Abstraction_YCH1 {
   //i) Abstract Method and class. 
   public static void main(String[] args) {
    serpentEagle T1 = new serpentEagle();
    T1.eat();
    T1.fly();

    GoldenEagle  T2;//reference variabe
    T2 = new GoldenEagle();
    T2.eat();
    T2.fly();


//An instance of a abstract class cannot be created for example Eagle T3=new Eagle(); but we can create reference of the abstract class Eagle e = new serpentEagle();
    Eagle T4 = new serpentEagle();
    T4.eat();
    T4.fly();

   /*  Test t5 = new Test();
    t5.Introduction(); */ // when we pass this statement make sure to remove the abstrct
  
   }
}
