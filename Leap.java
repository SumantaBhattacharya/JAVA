import java.util.Scanner;
public class Leap {
public static boolean leapyear(int year){
    if((year%4==0 && year%100!=0) || (year %400==0)){
        return true;
      
    }else{
        return false;
    }


}


    public static void main(String[] args) {
        System.out.println("PROGRAM TO CHECK GIVEN YEAR IS A LEAP YEAR OR NOT! ");
        System.out.println("Enter a year");
        Scanner sc = new Scanner(System.in);
       int year= sc.nextInt();
        System.out.println("Your given year is:"+ year);

        if (leapyear(year)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+"is not a leap year");
        }
        sc.close();
    }
}
