// Import the Arrays class
import java.util.Arrays;

public class IWL {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {10, 20, 4, 50, 15};
        // Sort the array in ascending order using the Arrays.sort() method
        Arrays.sort(arr);
        // Print the largest element, which is at the last index of the array
        System.out.println("The largest element in the array is " + arr[arr.length - 1]);
    }
    
}
