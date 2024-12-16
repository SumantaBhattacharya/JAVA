    import java.util.Scanner;
public class Vowel_C {//using recursion



    public static boolean isVowel(char ch) {
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'B' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }else{
            return false;
        }
    }
        
    

    public static void main(String[] args) {
        System.out.println("Java program to check whether a character is vowel or consonent");
        System.out.println("Enter any charcter type input");
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println("Your given character is "+ch);

        if (isVowel(ch)){
            System.out.println(ch+" is a vowel");

        }else{
            System.out.println("It is a consonent");
        }

        sc.close();
    }
}

