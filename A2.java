import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's marks: ");
        
        int marks = scanner.nextInt();
        
        // Using conditional logic
        if (marks < 0 || marks > 100) {
            System.out.println("wrong input!");
        } else if (marks >= 90) {
            System.out.println("O");
        } else if (marks >= 80) {
            System.out.println("A+");
        } else if (marks >= 70) {
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else if (marks >= 40) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        // Using pigeonhole principle (Dirichlet's drawer)
        //In the original context of your example, let's say we have 11 grade categories: 'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A', 'O'. These grades correspond to the ranges 0-9, 10-19, 20-29,30-39,40-49,50-59,60-69,70-79,80-89, 90-99, 100.and o for wrong input There are 11 categories
        if (marks < 0 || marks > 100) {
            System.out.println("wrong input!");
        } else {
            int grade = (marks / 10);
            char[] grades = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A', 'O'};
            System.out.println(grades[grade]);
        }
        scanner.close();
        
    }
}
