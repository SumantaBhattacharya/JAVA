/* Basics of java programming
 * A)Check Account Balance
 * B) Deposit Money
 * C) Withdraw money
 * D) previous Transection Details
 * E) calculate Fixed deposit interest
 * F) calculate saving account interest
*/
import java.util.*;
public class Banking_OpenW {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount ("SL devcode","SL0001");
        obj.showmenu();
    } 
}
class BankAccount{
    int balance;
    int PreviousTransection;
    String customername;
    String customerid;

     BankAccount(String cname, String cid) {
     customername = cname;
     customerid = cid;
     balance = 0; // Initialize balance to 0
     PreviousTransection = 0; // Initialize PreviousTransection to 0
}

     // methods
    void Deposit(int amount){
        if (amount != 0){
            balance = balance + amount;
            PreviousTransection=amount; 
        }
    }
    void withdraw(int amount){
        if (amount!=0){
            balance= balance-amount;
            PreviousTransection= -amount;
        }
    }
    void getPreviousTransection(){
        if(PreviousTransection>0){
            System.out.println("Deposited"+PreviousTransection);
        }
        else if (PreviousTransection < 0){
            System.out.println("withdraw:"+ Math.abs(PreviousTransection));
        }
        else{
            System.out.println("No transection occured");
        }
    }
    void showmenu(){
        char option = '\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome:"+customername);
        System.out.println("welcome:"+customerid);
        System.out.println("/n");
        System.out.println("A: check Account Balance");
        System.out.println("B: Deposit Money ");
        System.out.println("C) Withdraw money");
        System.out.println("D) previous Transection Details");
        System.out.println("E) calculate Fixed deposit interest");
        System.out.println("F) calculate saving account interest");
        System.out.println("Q) Exit");
    
        do {
            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("Enter your Option");
            System.out.println("+--------------------------------------------------------------------+");

        
            option = sc.next().charAt(0);

            switch(option){
            case 'A':
                 System.out.println("+--------------------------------------------------------------------+");
                 System.out.println("Account Balace = "+ balance);
                 System.out.println("+--------------------------------------------------------------------+");
                 System.out.println("\n");

                 break;
        
            case 'B':
                System.out.println("+--------------------------------------------------------------------+");
                System.out.println("Enter the amount to deposit");
                System.out.println("+--------------------------------------------------------------------+");
                int amount = sc.nextInt();
                Deposit(amount);
                System.out.println("Amount deposited in the account "+ amount);
                System.out.println("\n");

                break;

            case 'C':
                System.out.println("+--------------------------------------------------------------------+");
                System.out.println("Enter the amount to deposit");
                System.out.println("+--------------------------------------------------------------------+");
                int amount2 = sc.nextInt();
                withdraw(amount2);
                System.out.println("Amount withdrawn from the account="+amount2);

                System.out.println("\n");

                break;
            case 'D':
                System.out.println("+--------------------------------------------------------------------+");
                System.out.println("Your Previous  Transection Status is");
                getPreviousTransection();
                System.out.println("+--------------------------------------------------------------------+");
                System.out.println("\n");

                break;
            case 'E':
                double rate = 7.1;
                System.out.println("Enter the principal account");
                double principal = sc.nextDouble();
                System.out.println("Enter the period(in years):");
                double time = sc.nextDouble();
            // fixed deposit
                double fdiInterest= (principal*rate*time)/100;
                System.out.println("interest of fixed deposit:"+fdiInterest);
                break;
            case 'F':// savings account interest
                double interest=5;
                System.out.println("Enter the principal amount:");
                double  principalAmount = sc.nextDouble();
                System.out.println("Enter the period(in years):");
                double timePeriod = sc.nextDouble();
                double saInterest = principalAmount * Math.pow((1+interest/100),timePeriod)-principalAmount;
                System.out.println("Interest for saving account:"+saInterest);
                break;
            case 'Q':
            System.out.println("preparing to exit...");
            break;

                    default:
                    System.out.println("Invalid Option!! please enter one of the valid option: ");
                    break;
            }    
        }
        while (option != 'Q');
        System.out.println("ThANK YOU FOR USING OUR SERVICE: ");
        sc.close();
    }  
}



