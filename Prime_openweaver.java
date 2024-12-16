import java.util.Scanner;

public class Prime_openweaver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0; // Count of factors

        System.out.println("Input a number: ");
        int num = sc.nextInt();
        sc.close();
//a prime number is a whole number greater than 1 that cannot be evenly divided by any other whole number except 1 and itself.
        // Check if it is a prime number
        for (int i = 2; i < num; i++) {// i=1 then 2 then 3 then 4 then 5 then 6 then 7 then it stops iterating
            // when if condition fails then it is a prime number,prime number cannot divisible by 2
            if (num % i == 0) // suppose 8 % 2 == 0 if it is divisible by 2 then it is not a prime number
            count++; // 8%2 = count , 8%4 = count now | coun==2
          System.out.println(">"+i);
            System.out.println("C="+count);
        }

        if (num > 1 & count == 0) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
