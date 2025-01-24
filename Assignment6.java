import java.util.Scanner;

public class Assignment6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = 0;

        System.out.print("Are you ready for a quiz? (Y/N): ");
        String response = sc.nextLine().toUpperCase();

        if (response.equals("Y")) {
            System.out.println("\nOkay, here it comes!\n");

            // 1st question
            System.out.println("Q1) What is the capital of Alaska?");
            System.out.println("\t1) Melbourne");
            System.out.println("\t2) Anchorage");
            System.out.println("\t3) Juneau");
            System.out.print("> ");
            int answer1 = sc.nextInt();

            if (answer1 == 3) {
                System.out.println("\nThat's right!\n");
                
            } else {
                System.out.println("Sorry, the correct answer is 3) Juneau.");
            }

            // 2nd question
            System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");
            System.out.println("\t1) yes");
            System.out.println("\t2) no");
            System.out.print("> ");
            int answer2 = sc.nextInt();

            if (answer2 == 2) {
                System.out.println("\nThat's right!");
                
            } else {
                System.out.println("Sorry, \"cat\" is a string, ints can only store numbers.");
            }

            // 3rd question
            System.out.println("Q3) What is 9 + 6 / 3?");
            System.out.println("\t1) 5");
            System.out.println("\t2) 11");
            System.out.println("\t3) 15/3");
            System.out.print("> ");
            double answer3 = sc.nextDouble();

            if (answer3 == 2) {
                System.out.println("\nThat's right!");
                
            } else {
                System.out.println("Sorry, the correct answer is 2) 11.");
            }
             score = answer1+answer2+answer3;
            // Final Score
            System.out.println("\nOverall, you got " + score + " out of 3 correct.");
        } else {
            System.out.println("Okay, maybe next time.");
        
        }

        sc.close();
    }
}