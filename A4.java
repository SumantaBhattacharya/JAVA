    import java.util.Scanner;
public class A4 {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the student's marks:");
        int marks = scanner.nextInt();

        // Input validation
        if (marks < 0 || marks > 100) {
            System.out.println("Wrong input! Marks should be between 0 and 100.");
        } else {
            // Grade calculation using conditional logic
            String gradeByConditionalLogic = calculateGradeByConditionalLogic(marks);

            // Grade calculation using Dirichlet's drawer principle
            String gradeByDirichlet = calculateGradeByDirichlet(marks);

            // Output
            System.out.println("Grade by Conditional Logic: " + gradeByConditionalLogic);
            System.out.println("Grade by Dirichlet's Drawer Principle: " + gradeByDirichlet);
        }

        scanner.close();
    }

    // Function to calculate grade using conditional logic
    private static String calculateGradeByConditionalLogic(int marks) {
        if (marks >= 90) {
            return "O";
        } else if (marks >= 80) {
            return "A+";
        } else if (marks >= 70) {
            return "A";
        } else if (marks >= 60) {
            return "B+";
        } else if (marks >= 50) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    // Function to calculate grade using Dirichlet's drawer principle
    private static String calculateGradeByDirichlet(int marks) {
        // Assuming a simplified mapping of marks to grades based on pigeonhole principle
        int pigeonhole = marks / 10;

        switch (pigeonhole) {
            case 10:
            case 9:
                return "O";
            case 8:
                return "A+";
            case 7:
                return "A";
            case 6:
                return "B+";
            case 5:
                return "B";
            case 4:
                return "C";
            default:
                return "F";
        }
    }
}


