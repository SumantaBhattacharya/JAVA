package AreaOfTriangle;
import java.util.Scanner;

public class AreaOfTriangle {
    // i. find semiperimeter
    public static void main(String[] args) {
        int sideA;
        int sideB;
        int sideC;

        System.out.println("Enter the three sides of the triangle: ");
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st side of the triangle: ");
        sideA = sc.nextInt();
        System.out.print("Enter the 2nd side of the triangle: ");
        sideB = sc.nextInt();
        System.out.print("Enter the 3rd sides of the triangle: ");
        sideC = sc.nextInt();

        double semiperimeter = (sideA + sideB + sideC) / 2.0;

        // to form a triangle, every pair of sides added together must be greater than the third side
        if ((sideA + sideB) > sideC && (sideA + sideC > sideB) && (sideB + sideC) > sideA) {
            // ii. find area of a triangle
            double areaOfTriangle = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
            System.out.println("Area of a triangle: " + areaOfTriangle);
        }else {
            System.out.println("These sides cannot form a triangle.");
        }

        sc.close();

    }
}
