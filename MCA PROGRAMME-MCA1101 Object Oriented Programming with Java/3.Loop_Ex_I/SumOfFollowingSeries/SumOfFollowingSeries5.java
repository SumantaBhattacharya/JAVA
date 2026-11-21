import java.util.Scanner;

public class SumOfFollowingSeries5 {
    // 9. Write a program to obtain the sum of the n terms (n to be taken from the
    // user) of the
    // following series 1 - 3^2/2 + 5^3/3 -7^4/4.................................................

    public static double SumOfTheFollowingSeries(int n) {

        // i=1 odd +
        // i=2 even Negative (-)
        // 2*i - 1 this gives odd

        // int n = 4;
        double sum = 0;

        // Math.pow() always returns a double (a decimal)
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {// even
                sum = sum - (Math.pow((2 * i - 1), i) / i);
            } else {
                sum = sum + (Math.pow((2 * i - 1), i) / i);
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        double result = SumOfTheFollowingSeries(n);
        System.out.println("Sum of the following series: " + result);
        sc.close();
    }

}