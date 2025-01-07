/*The Fibonacci series is a series of numbers where each number is the sum of the previous two numbers. The first two numbers of the series are 1 and 1. For example, the Fibonacci series up to 10 terms is: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
Using iterative method:
To print the Fibonacci series up to a given limit using an iterative method
1.Declare and initialize three variables: first, second, and next and Assign 1 to both first and second, and 0 to next.
        2.Declare and initialize a variable n to store the limit of        the series. For example, n = 10.
        3. Use a for loop to iterate from 1 to n, and perform the following actions in each iteration:
•	Print the value of first.
•	Calculate the next term by adding first and second, and assign it to next.
•	Update the values of first and second by assigning second to first, and next to second.
•	Exit the loop and end the program.
 */
public class Fibo {
    public static void main(String[] args) {
        // Declare and initialize the variables
        int first = 1, second = 1, next = 0;
        // Declare and initialize the limit
        int n = 10;

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
    }
}
