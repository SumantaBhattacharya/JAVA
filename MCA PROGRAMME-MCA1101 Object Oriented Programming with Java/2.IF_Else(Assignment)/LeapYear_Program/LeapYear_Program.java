package LeapYear_Program;

import java.util.Scanner;

public class LeapYear_Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("PROGRAM TO CHECK GIVEN YEAR IS A LEAP YEAR OR NOT! ");
            System.out.print("Enter a year:- ");

            int year = sc.nextInt();

            if (year == 0) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            System.out.println("Your given year is:" + year);

            // if the year is divisible by 4 and not divisible by 100 its a leap year
            // If a number is divisible by 100, it is automatically divisible by 4 and if its divisible by 400, then it is a leap year
            // If a year is not divisible by 100, it cannot be divisible by 400.
            if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
                System.out.println(year + " is a leap year");
                break;
            } else {
                System.out.println(year + " is not a leap year");
            }
            
        }

        sc.close();
    }
}
