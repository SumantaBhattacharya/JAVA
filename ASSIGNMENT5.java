//C:\Users\Sumanta Bhattacharya\OneDrive\Desktop\.java\AGE-5+5.java
    import java.util.Scanner;
public class ASSIGNMENT5 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Hello. What is your name? ");
         String name = sc.nextLine();//constant
        System.out.println("Hi, " + name + "!");

        // Ask the user for their age
        System.out.print("How old are you? ");
        int age = sc.nextInt();

        // Calculate age in five years and five years ago
        int ageInFiveYears = age + 5;
        int ageFiveYearsAgo = age - 5;

        // Display the results
        System.out.println("Did you know that in five years you will be " + ageInFiveYears + " years old?");
        System.out.println("And five years ago you were " + ageFiveYearsAgo + "! Imagine that!");

        sc.close();
    }
}
    
    

