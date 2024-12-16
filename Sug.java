public class Sug {
    public static void main(String[] args) throws Exception{ 
        try{ 
        int a,b; 
        BufferedReader in = new BufferedReader(new 
        InputStreamReader(System.in)); 
        a = Integer.parseInt(in.readLine()); 
        b = Integer.parseInt(in.readLine()); 
        } 
        catch(NumberFormatException ex){ 
        System.out.println(ex.getMessage() + " is not a numeric value."); }
        }
    }