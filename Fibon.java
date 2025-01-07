
    import java.util.Scanner;
    public class Fibon {

    public static void main(String[] args) {
        // Declare and initialize the variables
        int first = 1, second = 1, next = 0;

        // Declare and initialize the limit using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int n = sc.nextInt();

        // Use a for loop to iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            // Print the first term
            System.out.print(first + " ");

            // Calculate the next term
            next = first + second;

            // Update the first and second terms
            first = second;
            second = next;
        }

        // Close the scanner
        sc.close();
    }
}

