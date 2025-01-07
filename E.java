public class E {
    public static void main(String[] args) {
        try{
            System.out.println("Can you be my lover till the very end");
            int x = 20;
            int y = 0;
            int k=x/y;
            System.out.println(k);
            System.out.println("To the girl I don't know I have yet fortunate enough to meet or not");// this line is not executing because int k=x/y; this line is throwing an exception and then the control goes to the catch block 
        }catch(ArithmeticException eArithmeticException){
            eArithmeticException.printStackTrace();
        }finally{
            System.out.println("Dying out very seconds");// this line will execute either the exception comes or not!
        }
        System.out.println("Whenever you feel like coming into my life please bring some butterflies in the stomach");//will execute regardless of whether an exception occurs or not.
    }
}
