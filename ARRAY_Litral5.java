import java.util.Arrays;
import java.util.Scanner;
public class ARRAY_Litral5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 integers:");
        int [] arr = new int[5];
        //input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("Array contents: " + Arrays.toString(arr));

      sc.close();  
    }
}
