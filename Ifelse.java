import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
System.out.println("a is ?");
        a=sc.nextInt();
System.out.println("b is ?");
        b=sc.nextInt();
System.out.println("c is ?");
        c=sc.nextInt();
        if (a>b && a>c)
    {
        System.out.println("a is >");
    }else if (b>c && b>a){
 System.out.println("b is >");
    }else{
        System.out.println("c is >");
    }
        sc.close();
    }

    
}
