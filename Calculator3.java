import java.util.Scanner;
public class Calculator3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble(); // Read the first number from the user

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble(); // Read the second number from the user

        // Prompt the user to enter an operator (+, -, *, /)
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // This code reads a single character entered by the user (the operator) and assigns it to the variable operator. 

        double result; // Variable to store the result of the calculation

        // Use a switch statement to perform the appropriate operation based on the operator entered
        switch (operator) {
            case '+':
                result = num1 + num2; // Addition
                break;
            case '-':
                result = num1 - num2; // Subtraction
                break;
            case '*':
                result = num1 * num2; // Multiplication
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2; // Division (check for division by zero)
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return; // Exit the program if division by zero is attempted
                }
                break;
            default:
                System.out.println("Invalid operator."); // Handle invalid operator
                return; // Exit the program if an invalid operator is entered
        }

        // Display the result of the calculation
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}

