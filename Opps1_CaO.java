public class Opps1_CaO {


    String name; 
    
    public static void main(String[] args) {
       /*Reference variable = it store adress of the object.present in stack segment   */ Opps1_CaO d = new Opps1_CaO();// instance variable = are those variable which are inside a class and outside an method.present in heap segment 
       // System.out.println(d.name);. Local variable has no default values.  are those variable which are inside a method  and outside of the class. present in stack segment


        d.name = "banke";
        System.out.println(d.name);


    }
    
}

