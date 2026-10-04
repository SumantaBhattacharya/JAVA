import java.util.Scanner;
public class AreaOfRectangle {
    // 6.	Write a program to find the area of a rectangle, length and breadth taken by the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        int length = sc.nextInt();

        System.out.print("Breadth: ");
        int width = sc.nextInt();

        int area = length * width;
        
        System.out.println("Area of Rectangle: " + area);

        sc.close();
    }
}
