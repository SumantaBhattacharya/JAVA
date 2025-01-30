abstract class Shape {
    // Abstract method to be implemented by subclasses
    public abstract void numberOfSides();
}

class Rectangle extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

class Triangle extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

class Hexagon extends Shape {
    @Override
    public void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

public class Main_1 {
    public static void main(String[] args) {
        // Create instances of each shape
        // Call the numberOfSides() method for each shape
        Shape rectangle = new Rectangle();
        rectangle.numberOfSides();
        Shape triangle = new Triangle();
        triangle.numberOfSides();
        Shape hexagon = new Hexagon();
        hexagon.numberOfSides();

        

    }
}

/* 
The output of this program is:

```
A rectangle has 4 sides.
A triangle has 3 sides.
A hexagon has 6 sides.
```

You can learn more about abstract classes and methods in Java from the following sources¹²³⁴. I hope this helps you. 😊

Source: Conversation with Bing, 3/12/2023
(1) Getting run time input in Abstract class in Java - Stack Overflow. https://stackoverflow.com/questions/51580145/getting-run-time-input-in-abstract-class-in-java.
(2) Java Program to Calculate Area Using Abstract Class. https://programsolve.com/java-program-to-calculate-area-using-abstract-class/.
(3) JAVA PROGRAMMING MANUAL 21-1-2016 - atri.edu.in. https://www.atri.edu.in/images/pdf/departments/JAVA%20PROGRAMMING%20%20MANUAL.pdf.
(4) Write a Java program to create an abstract class named Shape that .... http://www.computersciencelearn.in/write-a-java-program-to-create-an-abstract-class-named-shape-that-contains-an-empty-method-named-numberofsides/.
(5) jaison080/oop_lab: Contains solutions to all OOP Lab Programs - GitHub. https://github.com/jaison080/oop_lab.
(6) Java Program that shows the number of shapes in a geometric figure .... https://stackoverflow.com/questions/15621390/java-program-that-shows-the-number-of-shapes-in-a-geometric-figure-interactively.
(7) java - Calculate area of square, triangle and circle using both .... https://stackoverflow.com/questions/71689673/calculate-area-of-square-triangle-and-circle-using-both-inheritance-and-functio.
(8) S3-OBJECT-ORIENTED-PROGRAMMING-LAB-IN-JAVA - GitHub. https://github.com/PaulThomas20002/S3-OBJECT-ORIENTED-PROGRAMMING-LAB-IN-JAVA.
(9) Call a method of subclass in Java - Stack Overflow. https://stackoverflow.com/questions/2701182/call-a-method-of-subclass-in-java.
*/
