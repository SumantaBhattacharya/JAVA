
    import java.util.Scanner;
public class F {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1 ; i <= number; i++) {
            factorial = factorial *i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        
        scanner.close();
    }
}


