//pca:Java program to find GCD of two numbers

import java.util.Scanner;

public class GCD_or_HCF_2 {
    public static void main(String[] args) {
        System.out.println("Enter the Two numbers you want HCF of");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a=sc.nextInt();
        System.out.println("a="+a);
        System.out.println("enter your second number");
        int b=sc.nextInt();
        System.out.println("b="+b+"\n");

        while(a%b!=0){
           int r=a%b;
           a=b;
           b=r;

        }
        System.out.println("GCD="+b);

       /* 50)60(1   a=60 and b=50
        *    50
            -----
             10<---r

             a=b
             b=r
             
         10)50(5
            50
           -----
             0
            that means 10 is the gcd
        */
        sc.close();
    }
    
}
