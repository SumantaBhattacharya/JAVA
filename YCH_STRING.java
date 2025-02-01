import java.util.Arrays;

public class YCH_STRING {
    public static void main(String[] args) {// it java whatever starts with capital letter is a class
        // String is a class refer which type object you are created inside the heap memory
        // String is not mutable 
        // String is a collection of different character
      String name1 = "Sumanta Bhattacharya";
      String name2 = "Sumanta Bhattacharya";
      System.out.println("name1="+name1);
      System.out.println("name2="+name2);

      System.out.println(name1 == name2);// no 'is' operator
      System.out.println(name1 != name2);
      

      System.out.println(name1.equals(name2));// whatever you write inside the double inverted comma ("") is consider as a string value
      System.out.println(name1.charAt(8));
      System.out.println(name1.indexOf("B"));
       System.out.println(name1.length());
       System.out.println(name1.substring(8));
        System.out.println(name1.concat(name2));
        System.out.println(name1.hashCode());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.replace("a","o"));
      // String pool - A Seperate memory structure inside a Heap memory, it doesnt create different object in the heap memory for a variable having the same value. 
      System.out.println(Arrays.toString(name1.toCharArray()));// convertion from string to array
      System.out.println(name1.subSequence(0, 7));
     // how to create different objects in the heap memory of the same values
      String a = new String("Suman");
      String b = new String("Suman");// Here, A and B are pointing to different objects.They are having the same.values But for them different objects has been created inside the heaps memory.
      
      System.out.println("a="+a);
      System.out.println("b="+b);
      System.out.println(a == b);// no 'is' operator
      System.out.println(a != b);
       System.out.println(a.equals(b));// does not check the pointing value of a amd b , it just check the value are equal or not thats what equal method does









    }
    
}
