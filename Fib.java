/*Using recursion: 
Recursion is a technique where a method calls itself repeatedly
 * Define a recursive method that takes an integer parameter n and returns the nth term of the Fibonacci series when n is 0 or 1
  when n is greater than 1, in which case the method returns the sum of the previous two terms n-1 and n-2
  2.Declare and initialize a variable n to store the limit of the series. For example, n = 10.
  Use a for loop to iterate from 0 to n-1, and perform the following action in each iteration:
  Print the value returned by the recursive method in each iteration
  Exit the loop and end the program.
  */
public class Fib {
    // Define the recursive method
    public static int fibonacci(int n) {
        // Base case
        if (n == 0 || n == 1) {//starting point of fibonacci series
            return n;
        }
        // Recursive case
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Declare and initialize the limit
        int n = 10;
        // Use a for loop to iterate from 0 to n-1
        for (int i = 0; i < n; i++) {
            // Print the value returned by the recursive method
            System.out.print(fibonacci(i) + " ");
        }
    }
}
