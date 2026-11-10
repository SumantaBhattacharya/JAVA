import java.util.Scanner;

public class CelsiusToFahrenheit {
    // 8. Write a program to convert Celsius to Fahrenheit, Celsius is taken by the user. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Celsius = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);

        sc.close();
    }
}
