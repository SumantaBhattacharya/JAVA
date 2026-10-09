import java.util.Scanner;

public class TypesOfTriangle {
    // Write a program that reads three coordinates and calculates the side of the triangle. Check whether these numbers can be considered as the three sides of a triangle. If so, find the type (isosceles, equilateral or right-angled) and area of the triangle. 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x1 coordinate of the first point: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the y1 coordinate of the first point: ");
        int y1 = sc.nextInt();

        System.out.print("Enter the x2 coordinate of the second point: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the y2 coordinate of the second point: ");
        int y2 = sc.nextInt();

        System.out.print("Enter the x3 coordinate of the third point: ");
        int x3 = sc.nextInt();
        System.out.print("Enter the y3 coordinate of the third point: ");
        int y3 = sc.nextInt();

        double sideA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double sideB = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double sideC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {

            /*if (sideA == sideB && sideB == sideC) {
                System.out.println("Equilateral triangle");
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                System.out.println("Isosceles triangle");
            } else if (sideA * sideA + sideB * sideB == sideC * sideC || sideA * sideA + sideC * sideC == sideB * sideB || sideB * sideB + sideC * sideC == sideA * sideA) {
                // A right-angled triangle is a triangle where one angle is exactly 90°
                System.out.println("Right-angled triangle");
            } else {
                System.out.println("Scalene triangle");
            }*/

            boolean EquilateralTriangle = sideA == sideB && sideB == sideC;
            boolean IsoscelesTriangle = sideA == sideB || sideA == sideC || sideB == sideC;

            // Pythagoras theorem: hypotenuse² = base² + height²
            // all three possibilities
            // i. a^2+b^2=c^2 ii. a^2+c^2=b^2 iii. b^2+c^2=a^2

            // where the longest side (called the hypotenuse)., to check which side is longest we check all three possibilities
            boolean RightAngledTriangle = sideA * sideA + sideB * sideB == sideC*sideC || 
            sideA * sideA + sideC*sideC == sideB * sideB ||
            sideB * sideB + sideC*sideC == sideA * sideA;

            if (EquilateralTriangle) {
                System.out.println("Equilateral triangle");
            }
            
            // A triangle can be both isosceles and right-angled.

            if (IsoscelesTriangle) {
                System.out.println("Isosceles triangle");
            }

            if (RightAngledTriangle) {
                System.out.println("Right-angled triangle");
            }

            if (!EquilateralTriangle && !IsoscelesTriangle && !RightAngledTriangle) {
                System.out.println("Scalene triangle");
            }
           
            double semiperimeter = (sideA + sideB + sideC) / 2.0;

            double areaOfTriangle = Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));

            // Math.round gives whole number
            // Only printf understands % placeholders.
            // printf doesn't use + concatenation. 
            System.out.printf("Area of the triangle %.2f: ", areaOfTriangle);

        } else {
            System.out.println("These points cannot form a triangle.");
        }

        sc.close();
    }

}
