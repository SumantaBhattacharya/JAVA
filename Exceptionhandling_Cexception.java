// we will not provide here public if we do then it will raise an error because the compiler is getting confused which is the main class 
/*public*/
//part 5


class InvalidAgeExample extends Exception // super class
{// creating a constructor where we can pass only String value though it is a custom one we can pass any data type values we like with the datatype
    public InvalidAgeExample(String msg){
        System.out.println(msg);
    }
// here we difined and declared our custom class " InvalidAgeExample"
}
public class Exceptionhandling_Cexception {//custom_exception part 4

    public static void vote(int age) throws InvalidAgeExample{// argument 
        // initially the exception arised in vote class but it transferref to the main class i.e jvm to solve the exception
        /*       // by using throw keyword 
       // throw: throw keyword is use to explicitly tell the JVM(Java Virtual Machine.) that it is a exception
       //we have to create the instance of a object
       // syntax:-
       // throw(throw_keyword) new(creating_the_instance_of_a_object) Exception_name();
       //it is a user defined and can be custom defined constructor/exception
       // inside the curcular bracket we can only pass the String/character value
      */
       
        if(age<18){// there is no such exception called InvalidAgeExample here we are creating the instance i.e we are making an constructor
          throw new InvalidAgeExample("You are Not eligible to vote");//custom exception class
        }else{// this throw its our choice we can otherwise we dont need to
            System.out.println("You are eligible to vote");//InvalidAgeExample is a user defined exception/class
        }
    }
    public static void main(String[] args) throws InvalidAgeExample {
       /* try{
            vote(14);
        }catch(InvalidAgeExample IAE){
            IAE.printStackTrace();
        }*/
        
        vote(14);//method calling

    }
}