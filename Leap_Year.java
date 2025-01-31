import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        while(true){
        System.out.println("PROGRAM TO CHECK GIVEN YEAR IS A LEAP YEAR OR NOT! ");
        System.out.println("Enter a year");
        Scanner sc = new Scanner(System.in);
        
       int year= sc.nextInt();
        System.out.println("Your given year is:"+ year);
        
        if ((year%4==0 && year%100!=0) || (year %400==0)){
            System.out.println(year+" is a leap year");
            break;
        }else{
            System.out.println(year+" is not a leap year");
        }
sc.close();
    }
//sc.close(); will not execute because we are using while loop here 
}
}
