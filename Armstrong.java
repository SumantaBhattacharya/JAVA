  import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        int arm=0,jack,rem;
       
System.out.print("Hello. What is your number? ");
 Scanner sc = new Scanner(System.in);

 int num = sc.nextInt();
  jack=num;

System.out.println(num);

while(num>0){

     rem= num%10;
    arm=(rem*rem*rem)+arm;
    num=num/10;

 
}
   
    
 

if(jack == arm){
    System.out.println("armstrong number");
} else {
      System.out.println("not an armstrong number");}






  sc.close();
    }
    
}
