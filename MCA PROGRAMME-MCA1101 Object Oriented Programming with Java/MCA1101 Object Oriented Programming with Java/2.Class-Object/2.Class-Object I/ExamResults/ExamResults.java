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
            System.out.println("Student " + students[i].rollNo + " Total Marks: " + students[i].totalMarks);
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

/*
Enter the number of students: 5

Enter details for student 1:
Subject 1 marks: 67
Subject 2 marks: 68
Subject 3 marks: 69

Enter details for student 2:
Subject 1 marks: 05
Subject 2 marks: 34
Subject 3 marks: 43

Enter details for student 3:
Subject 1 marks: 8
Subject 2 marks: 22
Subject 3 marks: 30

Enter details for student 4:
Subject 1 marks: 01
Subject 2 marks: 10
Subject 3 marks: 78

Enter details for student 5:
Subject 1 marks: 81
Subject 2 marks: 99
Subject 3 marks: 57
Student 1 Total Marks: 204.0
Student 2 Total Marks: 82.0
Student 3 Total Marks: 60.0
Student 4 Total Marks: 89.0
Student 5 Total Marks: 237.0

--- (b) Highest Marks in Each Subject ---
Subject 1 Highest Marks: 81.0 (Secured by Roll No: 5)
Subject 2 Highest Marks: 99.0 (Secured by Roll No: 5)
Subject 3 Highest Marks: 78.0 (Secured by Roll No: 4)

--- (c) Highest Total Marks ---
Roll No: 5 achieved the highest total: 237.0
*/