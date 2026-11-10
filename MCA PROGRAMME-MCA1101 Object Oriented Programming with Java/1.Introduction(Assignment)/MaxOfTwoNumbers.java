import java.util.Scanner;

public class MaxOfTwoNumbers {
    // 3. Write a program to find out a maximum of two numbers, numbers are taken by the user.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        // Finding the maximum number
        if (num1 > num2){
            System.out.println("The maximum of the two numbers is: " + num1);
        }else{
            System.out.println("The maximum of the two numbers is: " + num2);
        }

        sc.close();

    }

}
