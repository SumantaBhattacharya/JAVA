public class FindRootsOfQuadraticEquation{
    //  Write a program to find the roots (real and imaginary) of the quadratic equation of the form ax^2 + bx + c = 0. 
 
    // A quadratic equation is an equation where the highest power of x is 2.
    // ax^2 + bx + c = 0.
    // a, b, c are numerical coefficients where a ≠ 0.
    // A root is a value of x that makes the equation equals 0
    // A quadratic equation has at most 2 roots.

    public static void main(String[] args) {
        
        double a = 69.8; // coefficient of x^2
        double b = 52.6; // coefficient of x
        double c = 75.9; // constant

        // The part under the square root, (b^2 - 4ac), is called the discriminant. 
        // discriminant = b^2 - 4ac

        // Quardratic formula: x = (-b ± √(b^2 - 4ac)) / 2a

        // If the discriminant is greater than 0, there are 2 real roots.
        // i. x = (-b + √(b^2 - 4ac)) / 2a ii. x = (-b - √(b^2 - 4ac)) / 2a

        // If the discriminant is equal to 0, there is 1 real root.
        // x = (-b ± √(0)) / 2a => -b / 2a

        // If the discriminant is less than 0, there are 2 complex roots.
        // When D is becoming less than 0, such as -1, -2, -3, etc., since is negative, -D is positive (negative of a negative number is positive)
        // √-1*(-D) = √-1 . √D so multiplying -1 with -D gives  
        // property applied √a*b = √a . √b
        // i = √-1 then i . √D = i√D
        // -D is greater than 0, as D is already nagative.
        // When roots come out as x = p ± q.i means the equation has two complex roots that are conjugates of each other.
        // x1 = p + q.i
        // x2 = p - q.i
        // By applying this formul
        // x = (-b ± √-1 . √-D) / 2.a as D is √(b^2 - 4ac)
        // i = √-1
        // x = (-b ± i . √-D) / 2.a can be broken down using p ± q.i where q = √-D
        // 1. x = (-b ± i . q)/ 2.a
        // x1 = -b + i . q/ 2.a = -b/2.a + √-D/2.a i (as q = √-D)
        // x2 = -b - i . q/ 2.a = -b/2.a - √-D/2.a i
        // 1.1 x = (-b ± q.i)/ 2.a
        // (-b/2.a ± q/2.a) i = -b ± √D.i/2.a
        // let p = -b/2.a and Q = q/2.a = √-D/2.a as q is √-D
        //  x = p ± Q.i
        // x1 = p+Q.i
        // x2 = p-Q.i

        if (a == 0) {
            System.out.println("The value of a cannot be zero.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are real and the same.");
            System.out.println("Root: " + root);
        } else {
            // cannot take the square root of a negative number in real numbers
            // Math.sqrt() in Java is designed to work only with real non-negative numbers. 
            double realPart = -b / (2 * a);//Real numbers: all numbers 
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);// An imaginary number is a number whose square is negative.
            System.out.println("The roots are complex and different.");
            System.out.println(realPart + " + " + imaginaryPart + "i");
            System.out.println(realPart + " - " + imaginaryPart + "i");
        }

    }
}
