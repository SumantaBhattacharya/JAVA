
import java.util.ArrayList;  // Import the ArrayList class



public class YCH_2D_Alist {
    public static void main(String[] args) {

        // Syntax to create an ArrayList of integers:
        // ArrayList<DataType> variableName = new ArrayList<DataType>(initialCapacity);
        //syntax= array_list_class_name <>(primitive type-rapper class its formatting the output) (interface) REFERENCE_OF_THE_ARRAY_VARIABLE = new_keyword_or_operator(a object is created inside the heap memory) (constructor=instance of the object)(it has to be same as class name)(isnide the heap memory we created a ArrayList_array)<>(size of the array);
        ArrayList<Integer> arr = new ArrayList<>();// Creating an ArrayList of integers with an initial capacity of 10 if we dont mention the size of array then it will create no error that menans it is okay to keep it empty
        // ArrayList<Integer> arr = new ArrayList<Integer>(12);
        // Declaration as well as memory allocation
        System.out.println(arr.add(69));// add method never gives output
        System.out.println(arr.add(68));
        System.out.println(arr.add(104));
        System.out.println(arr.add(420));

        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println(arr.remove(3));
        System.out.println(arr);
        

        for (int i = 0 ; i < 5; i++){
            
            System.out.println(arr);
            System.out.println(arr.get(i));
        }
       
    }
}
