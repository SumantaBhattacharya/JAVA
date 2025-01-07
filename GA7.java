import java.util.*;



public class GA7 {
    public static void main(String[] args) {
         System.out.println("I have choosen a number between 1 and 10. try to guess it");

        Scanner sc = new Scanner (System.in);

        System.out.println("what is your gender (M or F):");
        String gender = sc.nextLine().toUpperCase();;
        System.out.println(gender);

        System.out.println("what is your name:)");
        String name = sc.nextLine().toUpperCase();;
        System.out.println(name);

        System.out.println("what is your age:)");
        int age= sc.nextInt();
        System.out.println(age);

        if (gender.equals("F")){
            if (age == 20 || age >20){
                System.out.println("ARE YOU MARRIED,"+ name + "(Y or N)");
                String ans = sc.next();
                System.out.println(ans);

               if(ans.equals("Y")){
                System.out.println("then i shall call you MRS.");}
                 
                else{
                     System.out.println("then i shall call you MS.");
                     
                }         }       
        
            }else{

    if (age == 20 || age >20){
                System.out.println("ARE YOU MARRIED,"+ name + "(Y or N)");
                String ans = sc.next();
                

               if(ans.equals("Y")){
                System.out.println("then i shall call you MR.");}
                else{
                 
                
                     System.out.println("then i shall call you Mr.");}
                     
    }                 
        

}
    
    
    
        
                    
        




        
        sc.close();
    }
}
    



