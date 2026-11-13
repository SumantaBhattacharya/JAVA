/*2. The nos. in the sequence 0 1 1 2 3 5 8 13 21…………. are called Fibonacci nos. 
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

    // eg- 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    // suppose we conside a = 0 and b = 1 then a + b = c then if we swap the value of b to a and c to b means a = b and the b = c then again a + b, this cycle goes go until we reach to the nth term

    /*
    
    Steps-

    i. firstly, conside a = 0 and b = 1. 
    i. secondly, we print the 0 and 1, the first terms of fibonacci number.
    iii. Thirdly, to find the next term, we would add the a and b together to a varalble names c.
    iii.  if we swap the value of b to a and c to b means a = b and the b = c then again a + b.
    iv.  this cycle goes go until we reach to the nth term.
    v. we would need another variable to determien the number of terms, so we would initialise another variable name 'n' which would be the nth term. 
    vi. and make sure that the n is -2 because the first two terms are already printed

     */


/*
Fibonacci number                  Devided by one before                    Ratio

5                                          5/3                              1.66
8                                          8/5                              1.60
13                                         13/8                             1.62
21                                         21/13                            1.61
34                                         34/21                            1.61
55                                         55/34                            1.61                       

golden Ration - 1.6180

*/

/*
 * - The Fibonacci sequence is a series of numbers in which each number is the
 * sum of the two preceding ones, usually starting with 0 and 1.
 * - Fibonacci numbers are defined as follows: F(0) = 0, F(1) = 1, and F(n) =
 * F(n-1) + F(n-2) for n > 1.
 * - For example, the first few Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13,
 * 21, 34, 55, 89, 144, etc.
 * - The Fibonacci sequence is often used in various applications, including
 * computer science, mathematics, and biology.
 * - The Fibonacci sequence has various interesting properties, such as its
 * golden ratio, which is approximately 1.6180339887.
 * - Recursive solutions to the Fibonacci sequence often have a time complexity
 * of O(2^n), which means the number of recursive calls grows exponentially with
 * the input value.
 */
// 2. The nos. in the sequence 0 1 1 2 3 5 8 13 21…………. are called Fibonacci nos. Write a program to print the first n (to be taken as input) Fibonacci nos. 

import java.util.Scanner;

public class Fibonacci {
    public static void FibonacciSeries(int n) {
        int first = 0;
        int second = 1;

        calculateFibonacci(n, first, second);
    }

    private static void calculateFibonacci(int num, int first, int second) {
        // int n = 13;

        System.out.print("First " + num + " Fibonacci numbers: ");

        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");// Fibonacci number starts from 0

            int sum = first + second;
            first = second;
            second = sum;
        }

        System.out.println(); 
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int n = sc.nextInt(); // number of terms, not the value of the Fibonacci number.

        // So, n have to be at least 1
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            sc.close();
            return;
        }

        FibonacciSeries(n);

        sc.close();
    }
}
