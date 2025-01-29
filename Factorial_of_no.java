import java.util.Scanner;

public class Factorial_of_no {
    public static int isFactorial(int num1) {
        int i;
        if(num1 == 0){
            return 1;
        }else {
            int factorial = 1;
            for ( i = 1; i <= num1; i++) {
                factorial *= i; // Calculate the factorial within the loop
            }
            return factorial; // Return the result after the loop
        }
    }
    public static void main(String[] args) {
       
        System.out.println("java program to find the factorial of a number");
        System.out.println("enter a number");
        Scanner sc =new Scanner(System.in);
       int num1=sc.nextInt();
       System.out.println("your given number is:"+num1);

         if(num1<0){
        System.out.println("Factorial is not defined for nagative numbers");
       }else{
       int f=isFactorial(num1);
            System.out.println(f);}
sc.close();
    }

        
}    
