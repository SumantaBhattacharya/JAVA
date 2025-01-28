public class c4 {
    public static void parse(String str) {
        float f = 0; // Initialize to 0
        try {
            f = Float.parseFloat(str); //Attempt to parse(the parse method is responsible for attempting to convert a given string str into a floating-point number (float).)
        } catch (NumberFormatException y) {//Float.parseFloat(str);. However, since "invalid" cannot be parsed as a float, it throws a NumberFormatException.The catch block catches the NumberFormatException and sets f to 0.
            // Handle the exception if parsing fails
            f = 0; // Set to 0 in case of an exception
        } 
        finally {
            // Print the value of f
            System.out.println(f);
        }
    } 
    public static void main(String[] args) {
        parse("invalid");
    }
    
}
