package Rectangle;

import java.util.Scanner;

// 3. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. The first method named as 'setDim' takes length and breadth of the rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.
class Area {
    int length;
    int breadth;

    void setDim(int length, int breadth){//takes length and breadth of the rectangle as parameters
        this.length = length;
        this.breadth = breadth;
    }

    // the second method named as 'getArea' returns the area of the rectangle.
    int getArea(){ // Reads the values that were saved in the object
        int area = length * breadth;
        return area;
    }

}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        int length = sc.nextInt();

        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        Area Area1 = new Area();
        Area1.setDim(length, breadth);

        int area = Area1.getArea();
        System.out.println("Area of Rectangle: " + area);

        sc.close();
    }
}

/*
Length: 67
Breadth: 68
Area of Rectangle: 4556
*/