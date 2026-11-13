import java.util.Scanner;

public class MarksCalculator {
    /*5. Write a Program to enter marks of five subjects. Find the Sum and the Average of them and 
then assign grade to the students according to the rule below  
AVG                GRADE
>=90% to <=100%     O
>=80% to <=89%      A 
>=70% to <=79%      B
>=60% to <=69%      C
>=50% to <=59%      D
>=40% to <=49%      E
>40%                FAIL
*/

    public static String calculateGrade(double average) {
        if (average >= 90 && average <= 100) {
            return "O";
        } else if (average >= 80 && average <= 89) {
            return "A";
        } else if (average >= 70 && average <= 79) {
            return "B";
        } else if (average >= 60 && average <= 69) {
            return "C";
        } else if (average >= 50 && average <= 59) {
            return "D";
        } else if (average >= 40 && average <= 49) {
            return "E";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        
        /*String[] subjects = {
            "Object Oriented Programming with Java",
            "Advanced Programming Concepts with Python",
            "Software Engineering",
            "Artificial Intelligence",
            "Mathematical Foundations"
        };
        
        int numberOfSubjects = subjects.length;*/

        int numberOfSubjects = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of five subjects: ");

        int totalMarks = 0;

        /*for (int i = 0; i < subjects.length; i++) {// 0, 1, 2, 3, 4
            System.out.print("Subject " + subjects[i] + ": ");
            int marks = sc.nextInt();
            totalMarks = totalMarks + marks;
        }*/

        for (int i = 0; i <= numberOfSubjects - 1; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            int marks = sc.nextInt();
            totalMarks = totalMarks + marks;
        }

        double average = (double) totalMarks / numberOfSubjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + average);

        System.out.println("Grade: " + calculateGrade(average));

        sc.close();

    }
}

//  javac "C:\Users\Sumanta Bhattacharya\Desktop\.java\MCA PROGRAMME-MCA1101 Object Oriented Programming with Java\2.IF_Else(Assignment)\MarksCalculator.java"
// java "C:\Users\Sumanta Bhattacharya\Desktop\.java\MCA PROGRAMME-MCA1101 Object Oriented Programming with Java\2.IF_Else(Assignment)\MarksCalculator.java" 