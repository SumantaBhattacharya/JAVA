import java.util.*;
public class Guess {
    public static void main(String[] args) {
         System.out.println("I have choosen a number between 1 and 10. try to guess it");
        Scanner sc = new Scanner (System.in);
        
         while(true)
         {
            System.out.println("enter an integer number ");
            int a = sc.nextInt();
            System.out.println("your guess is:"+a);
            
            if (a == 9){
                System.out.println(" you have guessed it correct ");
                break;
                


            }
            else{
                System.out.println(" thats incorrect. guess again ");
                continue;
            }
        }
sc.close();
         }

       
    }

