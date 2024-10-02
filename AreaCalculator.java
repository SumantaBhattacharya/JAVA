//Assignment nine
//Area calculatorr
//write a programme to calculate the area of four different geometrics; triangle square triangle and circle you must use functions.Your programme should present a menu for the human to choose which shape you want to calculate then ask for the appropriate values ( Length .width, radius etc)Then it should pass those values to the appropriate function and display the resulting area

import java.util.Scanner;

public class AreaCalculator {


   static double area_circle(double radius){
      double result= Math.PI*radius*radius;
       return (result);
}
 static int area_rectrangle(double length,double width){
      double result= length*width;
      return (int) (result);

}
static int area_square(double side){
      int result= (int) (side*side);
      return(result);

}
static double area_triangle(double base , double height){
      
       return (0.5*base*height);
}
    


   
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
         while(true){
            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("|1|\t\t\t"+" CIRCLE ");
              System.out.println("|2|\t\t\t"+" RECTRANGLE  ");
                System.out.println("|3|\t\t\t"+" SQUARE ");
                  System.out.println("|4|\t\t\t"+" TRAINGLE ");
                     System.out.println("|5|\t\t\t"+" QUIT ");
            System.out.println("+--------------------------------------------------------------------+");
                      System.out.println("\nwhich GEOMETRIC shape you want to calculate ");
           
            int num=sc.nextInt();
           switch (num) {
            case 1:// area of circle
            System.out.println("radius:");
         double radius=sc.nextDouble();
         double area1=area_circle(radius);
         System.out.println(area1);
          break;
          case 2:// area of rectrangle
            System.out.println("length:");
         double length=sc.nextDouble();
         System.out.println(" Width:");
         double width=sc.nextDouble();
         double area2=area_rectrangle(length,width);
         System.out.println(area2);
          break;
          case 3:// area of 
            System.out.println("side:");
         double side=sc.nextDouble();
         double area3=area_square(side);
         System.out.println(area3);
          break;
          case 4:// area of triangle
            System.out.println("Base:");
         double base=sc.nextDouble();
         System.out.println(" height:");
         double height=sc.nextDouble();
          System.out.println (area_triangle(height,base));
         
          break;
          case 5:
          System.out.println("quit");
          break;
          


           
            default:
            System.out.println("Invalid input. Please try again later");
               break;
           }

           
  
  
    
         }
      }
         
      }

   }
 

