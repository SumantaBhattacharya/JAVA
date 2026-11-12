/*4. The annual examination results of N students are tabulated as follows:
Roll No. Subject_1 Subject_2 Subject_3
... ..... ...... .......
Write a program to read the data and determine the following:
(a) Total marks obtain by each student
(b) The highest marks in each subject and the roll no of the student who secured it
(c) The student who obtained the highest total marks*/

import java.util.Scanner;

class Student{
    int rollNo;//21
    double subject_1, subject_2, subject_3;
    double totalMarks;

    public Student(int rollNo,
    double subject_1, double subject_2, double subject_3){

        this.rollNo = rollNo;
        this.subject_1 = subject_1;
        this.subject_2 = subject_2;
        this.subject_3 = subject_3;
        this.totalMarks = subject_1 + subject_2 + subject_3;

    }

}

public class ExamResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = sc.nextInt();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i <= students.length - 1; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            
            System.out.print("Subject 1 marks: ");
            double subject_1 = sc.nextDouble();

            System.out.print("Subject 2 marks: ");
            double subject_2 = sc.nextDouble();

            System.out.print("Subject 3 marks: ");
            double subject_3 = sc.nextDouble();

            //  In Java, you must declare the array once (outside the loop), and then just assign values to the specific index inside the loop.
            students[i] = new Student(i + 1, subject_1, subject_2, subject_3);
        }

        // (a) Total marks obtain by each student
        for (int i = 0; i <= students.length - 1; i++) {
            System.out.println("Student " + students[i].rollNo + "Total Marks: " + students[i].totalMarks);
        }

        // (b) The highest marks in each subject and the roll no of the student who secured it

        // cannot pass values directly inside curly braces {} to create an object in Java.
        // Java passes primitive values by value (it makes a copy), not by reference.
        double highestsubject_1Marks = -1;
        int highestsubject_1RollNo = -1;

        double highestsubject_2Marks = -1;
        int highestsubject_2RollNo = -1;

        double highestsubject_3Marks = -1;
        int highestsubject_3RollNo = -1;

        /*double[] highestMarks = {highestsubject_1Marks, 
            highestsubject_2Marks, 
            highestsubject_3Marks};
        int[] topRollNo = {highestsubject_1RollNo,
            highestsubject_2RollNo, 
            highestsubject_3RollNo};*/

        for (int i = 0; i <= students.length - 1; i++) {
            // each time update
            if (students[i].subject_1 > highestsubject_1Marks) {
                highestsubject_1Marks = students[i].subject_1;
                // who got it?
                highestsubject_1RollNo = students[i].rollNo;
            }
            if(students[i].subject_2 > highestsubject_2Marks){
                highestsubject_2Marks = students[i].subject_2;
                highestsubject_2RollNo = students[i].rollNo;
            }
            if(students[i].subject_3 > highestsubject_3Marks){
                highestsubject_3Marks = students[i].subject_3;
                highestsubject_3RollNo = students[i].rollNo;
            }
        }

        System.out.println("\n--- (b) Highest Marks in Each Subject ---");

        System.out.println("Subject 1 Highest Marks: " + highestsubject_1Marks + " (Secured by Roll No: " + highestsubject_1RollNo + ")");
        System.out.println("Subject 2 Highest Marks: " + highestsubject_2Marks + " (Secured by Roll No: " + highestsubject_2RollNo + ")");
        System.out.println("Subject 3 Highest Marks: " + highestsubject_3Marks + " (Secured by Roll No: " + highestsubject_3RollNo + ")");
        /*for (int i = 0; i <= students.length - 1; i++) {
            System.out.println("Subject " + (i + 1) + " Highest Marks: " + highestSubjectMarks[i] 
                               + " (Secured by Roll No: " + topRollNoPerSubject[i] + ")");
        }*/

        // (c) The student who obtained the highest total marks
        double highest_totalMarks = -1;
        int highestTotalMarks_RollNo = -1;

        for (int i = 0; i <= students.length - 1; i++) {
            if (students[i].totalMarks > highest_totalMarks) {
                highest_totalMarks = students[i].totalMarks;
                highestTotalMarks_RollNo = students[i].rollNo;
            }
        }

        System.out.println("\n--- (c) Highest Total Marks ---");
        System.out.println("Roll No: " + highestTotalMarks_RollNo + " achieved the highest total: " + highest_totalMarks);

        sc.close();
        
    }
}
