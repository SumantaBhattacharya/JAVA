import java.util.Scanner;

public class GCD_or_HCF {
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
        

        for (int i = 1; i<=a && i<=a ; i++){
            if (a%i==0 && b%i==0){
                System.out.println(i);
                g=i;
                
            }
        }
      
         System.out.println("Greatest Common Factor:-"+g);

         sc.close();
    }
}
     /* 50%1 && 60%1 ==0 True  
      * 50%2 && 60%2 ==0 True 
        50%3 && 60%3 ==  False
        50%4 && 60%4 ==  False
        50%5 && 60%5 ==0 True
        50%6 && 60%6 ==  False
        50%7 && 60%7 ==  False 
        50%8 && 60%8 ==  False
        50%9 && 60%9 ==  False
        50%10 && 60%10 ==0 True  
     */
