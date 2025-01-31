import java.util.Scanner;
public class GCD_or_HCF_recursion {
public static int findGCD(int num1 ,int num2){// num1=a,num2=b

    if(num1%num2==0){// 50%60!=0 else part will execute then it again comes to this line 50%10 == 0 
        return num2;//10 
    }else{
        return(findGCD(num2,num1%num2));
                //       a  , b
                //       50 , 10 it is a remainder
    }


}



//Renamed the FindGCD method to findGCD to follow Java naming conventions. Function names should start with lowercase letters.


        //pca:Java program to find GCD of two numbers using recursion
            public static void main(String[] args) {
        int g=0;

        System.out.println("Enter the Two numbers you want HCF of");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a=sc.nextInt();
        System.out.println("a="+a);
        System.out.println("enter your second number");
        int b=sc.nextInt();
        System.out.println("b="+b+"\n");

         g=findGCD(a,b);//calling the method
         System.out.println(g);

     sc.close();   
    }
    

}

