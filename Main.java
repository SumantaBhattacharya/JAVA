//import java.util.Stack;

// Define the Employ class
class Employ {
  // Declare the data members
  String name;
  int age;
  String phoneNumber;
  String address;
  double salary;

  // Define the constructor
  Employ(String name, int age, String phoneNumber, String address, double salary) {
    this.name = name;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.salary = salary;
  }

  // Define the printSalary method
  void printSalary() {
    System.out.println("Salary: " + salary);
  }
}

// Define the Officer class that inherits from Employ
class Officer extends Employ {
  // Declare the specialization data member
  String specialization;

  // Define the constructor
  Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
    // Call the superclass constructor
    super(name, age, phoneNumber, address, salary);
    // Assign the specialization
    this.specialization = specialization;
  }
}

// Define the Manager class that inherits from Employ
class Manager extends Employ {
  // Declare the department data member
  String department;

  // Define the constructor
  Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
    // Call the superclass constructor
    super(name, age, phoneNumber, address, salary);
    // Assign the department
    this.department = department;
  }
}

// Define the main class
public class Main {
  // Define the main method
  public static void main(String[] args) {
    // Create an object of Officer class
    Officer officer = new Officer("Alice", 30, "123-456-7890", "New York", 50000, "IT");
    // Print the officer's details
    System.out.println("Officer details:");
    System.out.println("Name: " + officer.name);
    System.out.println("Age: " + officer.age);
    System.out.println("Phone number: " + officer.phoneNumber);
    System.out.println("Address: " + officer.address);
    officer.printSalary();
    System.out.println("Specialization: " + officer.specialization);
    System.out.println();

    // Create an object of Manager class
    Manager manager = new Manager("Bob", 35, "987-654-3210", "Los Angeles", 70000, "Sales");
    // Print the manager's details
    System.out.println("Manager details:");
    System.out.println("Name: " + manager.name);
    System.out.println("Age: " + manager.age);
    System.out.println("Phone number: " + manager.phoneNumber);
    System.out.println("Address: " + manager.address);
    manager.printSalary();
    System.out.println("Department: " + manager.department);
  }
}

/* 
Source: Conversation with Bing, 3/12/2023
(1) Practice questions of Java - subclass - CodesDope. https://www.codesdope.com/practice/java-subclass/.
(2) Answer in Java | JSP | JSF for azmeraw #190875 - Assignment Expert. https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-190875.
(3) GitHub: Let’s build from here · GitHub. https://github.com/hemantarora81/-Create-a-class-named-Member-having-the-following-members-Data-members/blob/main/Class%20Inheritance.
(4) Answer in Java | JSP | JSF for Neha Narayan Nayak #204514. https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-204514.
(5) Create a class named 'member' having the following members: data .... https://brainly.in/question/54878644.
(6) java - Employee Salary Calculation - Stack Overflow. https://stackoverflow.com/questions/58047124/employee-salary-calculation.
(7) Write a program by creating an 'Employee' class having the following .... https://dev.to/shiwani295/write-a-program-by-creating-an-employee-class-having-the-following-methods-and-print-the-final-salary-4ggd.
(8) java - Employee name and salary using array - Stack Overflow. https://stackoverflow.com/questions/8200873/employee-name-and-salary-using-array.
(9) Declaring a Manager class that inherits from the Employee class (Java). https://stackoverflow.com/questions/61421085/declaring-a-manager-class-that-inherits-from-the-employee-class-java.
(10) Java program to create an employee class by inheriting Person class. https://www.includehelp.com/java-programs/create-an-employee-class-by-inheriting-person-class.aspx.
(11) OOP Program 8 - Employee Class | Complete Program With Output - Codingee. https://codingee.com/program-8-employee-class/.
(12) Java Inheritance Tutorial with Examples - HowToDoInJava. https://howtodoinjava.com/java/oops/java-inheritance/.
(13) LABORATORY MANUAL B.TECH - CSE SEMESTER-III (2019 Regulation-KTU .... https://jawaharlalcolleges.com/downloads/dpt/cse/course/semester3/CSL203_OOPJ%20Lab%20MANUAL.pdf.
(14) Answer in Java | JSP | JSF for arwa #124110 - Assignment Expert. https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-124110.
(15) Answer in Java | JSP | JSF for Shouzab #123901 - Assignment Expert. https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-123901.
(16) GitHub: Let’s build from here · GitHub. https://github.com/emvk09/Java_Program_Basics/blob/main/EmployeeManagement.java.
(17) S3-OBJECT-ORIENTED-PROGRAMMING-LAB-IN-JAVA - GitHub. https://github.com/PaulThomas20002/S3-OBJECT-ORIENTED-PROGRAMMING-LAB-IN-JAVA.
(18) undefined. https://github.com/hemantarora81/-Create-a-class-named-Member-having-the-following-members-Data-members/blob/main/Class%20Inheritance?raw=true.
(19) undefined. https://desktop.github.com.
(20) undefined. https://docs.github.com/articles/about-issue-and-pull-request-templates.
(21) undefined. https://github.com/hemantarora81/-Create-a-class-named-Member-having-the-following-members-Data-members/raw/main/Class%20Inheritance.
(22) undefined. https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files.
(23) undefined. https://github.com/emvk09/Java_Program_Basics/blob/main/EmployeeManagement.java?raw=true.
(24) undefined. https://github.com/emvk09/Java_Program_Basics/raw/main/EmployeeManagement.java.
// Create an object of Manager class
Manager manager = new Manager("Bob", 35, "987-654-3210", "Los Angeles", 70000, "Sales");
// Print the manager's details
System.out.println("Manager details:");
System.out.println("Name: " + manager.name);
System.out.println("Age: " + manager.age);
System.out.println("Phone number: " + manager.phoneNumber);
System.out.println("Address: " + manager.address);
manager.printSalary();
System.out.println("Department: " + manager.department);
*/
