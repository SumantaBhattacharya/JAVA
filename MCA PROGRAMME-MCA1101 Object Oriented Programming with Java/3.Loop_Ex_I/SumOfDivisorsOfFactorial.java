/*
 * 3. Write a Program to find sum of divisors of factorial of a number 
 * Input: 4   Output: 60 
 * Factorial of 4 is 24. Divisors of 24 are 
 * 1 2 3 4 6 8 12 24, the sum of these is 60.
*/

public class SumOfDivisorsOfFactorial {

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Method to find the sum of divisors
    public static long calculateSumOfDivisors(long factorial) {
        long sum = 0;

        // 1 2 3 4 6 8 12 24, are the devisors
        // the sum of these is 60.
        for (long i = 1; i <= factorial; i++) {
            if (factorial % i == 0) { // devisors
                sum = sum + i; // then sum
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        
        int n = 4;
        long factorial = calculateFactorial(n);
        long sum = calculateSumOfDivisors(factorial);
        System.out.println("Sum of divisors of factorial of " + n + " is: " + sum);

    }

}
