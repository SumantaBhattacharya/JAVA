/*PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java> javac Indra_cal.java      
        PS C:\Users\Sumanta Bhattacharya\OneDrive\Documents\Desktop\.java> javac Indra_main.java
        Indra_main.java:3: error: cannot access Indra_cal
                Indra_cal T1 = new Indra_cal();
                ^
          bad source file: .\Indra_cal.java
            file does not contain class Indra_cal
            Please remove or make sure it appears in the correct subdirectory of the sourcepath.
        1 error */
package other.tools;// package is a collection of same type of class.it is a organised library
public class Indra_cal {
    public int add(int x,int y){
        return (x+y);
    }
    public int sub(int x,int y){   
        return (x-y);
    }
}
