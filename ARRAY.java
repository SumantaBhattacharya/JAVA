
import java.util.Arrays;
//Array is a fixed size linear data structure and a collection of multiple items special variable of same data type
public class ARRAY {
    public static void main(String[] args) {
        System.out.println("hello and welcome into the programming world wishes!!!");
      //declaration//initialisation(memory allocation)
      char vowels[]=new char[5]; // syntax class reference_variable = new_keyword [size] constructor array of object The new keyword activate the JVM .creation a reference variable responsible to store address of object
      vowels[0]='a';
      vowels[1]='e';
      vowels[2]='i';
     vowels[3]='o';
     vowels[4]='u';
      System.out.println((Arrays.toString(vowels)));
      System.out.println(vowels[0]);
      System.out.println(vowels); 


     int i; 
      for (i=0;i<6;i++){ 
      System.out.println(vowels);} 
      


    }
    
}
// Execution communicate inside the stack memory.Execution is inside the stack memory,We can access tag through Heaps memory.Execution cannot directly communicate with the heap memory.JVM will create an object inside the heap's memory in runtime.Objects are always created inside the heap's memory. 
//stack memory allocation is a part of compile time
//In Java, array is a part of dynamic memory allocation. That means memory is created in runtime while creating an object stored in Heaps memory.
//Reference object is created in compile time stored in Stack
//In Java, all the items in array are stored at the contiguous memory location.Those who stored in Heaps memory majority of them are objects And objects are always non contagious.Declaration memory allocation initialization are the steps
