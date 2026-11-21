import java.util.Scanner;

public class StudentMarks {
    /*
     * 1. Given a list of marks (ranging from 0 to 100) of n (user input) students,
     * write a program to
     * print the number of students who have obtain marks:
     * (a) in the range 81 to 100
     * (b) in the range 61 to 80
     * (c) in the range 41 to 60
     * (d) in the range 0 to 40
     */

    static Scanner sc = new Scanner(System.in);

    public static void StudentMarksDistribution(int n) {
        int count81_100 = 0;
        int count61_80 = 0;
        int count41_60 = 0;
        int count0_40 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the marks (ranging from 0 to 100) for student" + i + ": ");
            int marks = sc.nextInt();

            if (marks >= 81 && marks <= 100) {
                count81_100++;
            } else if (marks >= 61 && marks <= 80) {
                count61_80++;
            } else if (marks >= 41 && marks <= 60) {
                count41_60++;
            } else if (marks >= 0 && marks <= 40) {
                count0_40++;
            } else {
                System.out.println("Invalid marks entered for student " + i + ". Please enter marks between 0 and 100.");
                i--; // Decrement i to repeat the input for the same student
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Students in range 81-100: " + count81_100);
        System.out.println("Students in range 61-80 : " + count61_80);
        System.out.println("Students in range 41-60 : " + count41_60);
        System.out.println("Students in range 0-40  : " + count0_40);

    }

    public static void main(String[] args) {
        System.out.print("Enter the number of students (n): ");
        int n = sc.nextInt();

        StudentMarksDistribution(n);
        
        sc.close();
    }

}
