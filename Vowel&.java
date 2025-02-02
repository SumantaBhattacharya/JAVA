import java.util.Scanner;

public class Vowel& {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a character:");
        char ch = scanner.next().charAt(0); // Read the input character

        // Convert the character to lowercase for case insensitivity
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        scanner.close(); // Close the Scanner object to free resources
    }
}
/*
Create a Java class named SwapNumbers.

Inside the class, create the main method:
  - Define a Scanner object named scanner to read input from the user.
  - Print "Enter the first number: " to prompt the user to enter the first number.
  - Read the first number entered by the user and store it in the variable num1 using scanner.nextInt().
  - Print "Enter the second number: " to prompt the user to enter the second number.
  - Read the second number entered by the user and store it in the variable num2 using scanner.nextInt().

  - Print "Before swapping: num1 = " + num1 + ", num2 = " + num2 to display the values of num1 and num2 before swapping.

  - Create an integer variable named temp and assign the value of num1 to it (temp = num1).
  - Assign the value of num2 to num1 (num1 = num2).
  - Assign the value of temp (which holds the original value of num1) to num2 (num2 = temp).
  - This effectively swaps the values of num1 and num2.

  - Print "After swapping: num1 = " + num1 + ", num2 = " + num2 to display the values of num1 and num2 after swapping.

End of the main method.

End of the SwapNumbers class.
 */