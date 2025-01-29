import java.util.*;//array litral

public class ARRAYL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        int[] arr = new int[5];
        
        for (int i = 0; i < (arr.length); i++) {
            arr[i] = sc.nextInt();
        }
        //output
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        sc.close(); // Closing the scanner
    }
}
