import java.util.Scanner;

public class LeapYear {

    // 4. Write a Program to check whether a Year is Leap year or not.  

    public static boolean isLeapYear(int year){
        
            // Check if the year is divisible by 100 
            // i. if yes divide the year with 400 
            // ii. if its fails to be divisible by 100 
            // ii.i then check if its divisible by 4

            if (year % 100 == 0){
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }else{
                if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // local variables do not get default values
        int count = 0;

        while (true) {

            if (count == 0) {
                System.out.println("PROGRAM TO CHECK GIVEN YEAR IS A LEAP YEAR OR NOT! ");
                System.out.print("Enter a year:- ");
            }else{
                System.out.print("Enter a year or Type 'Exit' to stop this loop:- ");
            }

            String input = sc.next();

            if (count > 0 && input.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting...");// thanks for showing Up!
                break;
            }

            int year;

            try {// if we decleared year inside try block then it will not be accessible outside the try block so we decleared it outside the try block
                year = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year or type 'Exit' to stop.");
                continue;
            }

            // int year = sc.nextInt();
            System.out.println("Your given year is:" + year);

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }

            count++;
        }

        sc.close();

    }
}
