
import java.util.Scanner;

public class SumOfFollowingSeries6 {
    // 10. Write a program to obtain the sum of the n terms (n and x to be taken from the user) of the following series 
    // x – x^3/3! + x^5/5! - x^7/7! ...........................................

    public static double SumOfTheFollowingSeries(int n, double x) {

        // i=1 odd +
        // i=2 even Negative (-)
        // 2*i - 1 this gives odd

        double sum = 0;

        // Math.pow() always returns a double (a decimal)
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {// even
                sum = sum - (Math.pow(x, (2 * i - 1)) / factorial(2 * i - 1));
            } else {
                sum = sum + (Math.pow(x, (2 * i - 1)) / factorial(2 * i - 1));
            }
        }
        return sum;

    }

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        
        double result = SumOfTheFollowingSeries(n, x);
        System.out.println("Sum of the following series: " + result);
        sc.close();
    }

}



