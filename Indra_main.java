// this class is out of the package tools that why we need to import the classes to execute it
import other.tools.Indra_advancedCal;
import other.tools.Indra_cal;
//import other.tools.*;
 
    public class Indra_main {
    public static void main(String[] args) {
       other.tools.Indra_cal T1 = new Indra_cal();
       int sum= T1.add(68, 1);
       System.out.println(sum);

       Indra_advancedCal T2 = new Indra_advancedCal();
       int into= T2.mul(23, 3);
       System.out.println(into);

       Indra_advancedCal T3 = new Indra_advancedCal();
       float modulus= T3.mod(63.0f, 4.0f);
       System.out.println(modulus);
// javac -d bin Indra_main.java

       

// theme dark(visual studio)

    }

}
