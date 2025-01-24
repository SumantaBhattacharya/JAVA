//A Dumb Calculator
//Make a simple numeric calculator. It should prompt the user for three numbers. Then add the numbers together and divide by 2. Display the result. Your program must support numbers with decimals and not just integers.
import java.util.Scanner;

public class ASSIGNMNT {
    
    
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("What is your first number? ");
            double number1 = sc.nextDouble();
    
            System.out.print("What is your second number? ");
            double number2 = sc.nextDouble();
    
            System.out.print("What is your third number? ");
            double number3 = sc.nextDouble();
    
            double result = (number1 + number2 + number3) / 2;
    
            System.out.println("( " + number1 + " + " + number2 + " + " + number3 + " ) / 2 is... " + result);
            
sc.close();
         
        }
    }
        
    
