import java.util.*;

public class BMI {
    public static void main(String[] args) {
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight (in kilograms):");
        double weight = sc.nextDouble();
        System.out.println("Your given weight is: " + weight + " kg");

        System.out.println("Enter height (in meters):");
        double height = sc.nextDouble();
        System.out.println("Your given height is: " + height + " meters");

        double BMI = weight / Math.pow(height, 2);
        System.out.println("Your BMI is: " + BMI);

        if (BMI <= 18.5) {
            System.out.println("Underweight");
        } else if (BMI > 18.5 && BMI < 25) {
            System.out.println("Normal (Healthy Weight)");
        } else {
            System.out.println("Overweight");
        }
        
        sc.close();
    }
}