import java.util.Scanner;

public class Armstrong {

    // For an Armstrong number: 
    // i. separate the digits, 
    // ii. raise each digit to the power of the total number of digits, 
    // iii. sum them, 
    // iv. remove the last digit, and then compare.

    public static boolean ArmstrongChecker(int num) {

        // i is the length of the number
        // int i = String.valueOf(num).length(); // .length() returns an int.This is a built-in String method that counts how many characters are in the string.
        
        int sum = 0;

        // find the i
        int i = 0; // 'i' is the total number of digits
        int tempNumber = num;
        while(tempNumber > 0){
            i++; // each time loop runs, increment i by 1
            tempNumber = tempNumber / 10;
        }
        
        int tempNum = num;
        // we are using a while loop because i is fixed to a number and not iterating
        while(tempNum > 0){ // run until the number is reduced to 0
            // i. separate the digits
            int lastDigit = tempNum % 10;
            // ii. raise each digit to the power of the total number of digits
            int power = (int) Math.pow(lastDigit, i);
            // iii. sum them
            sum = sum + power;
            // iv. remove the last digit
            tempNum = tempNum / 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // m

        System.out.println("Armstrong numbers between 1 and " + num + " are:");

        for (int i = 1; i <= num; i++) {
            if (ArmstrongChecker(i)) {
                System.out.print(i + " ");
            }
        }

        // if (ArmstrongChecker(num) == true) {
        //     System.out.println(num + " is an Armstrong number.");
        // } else {
        //     System.out.println(num + " is not an Armstrong number.");
        // }

        sc.close();

    }
}
