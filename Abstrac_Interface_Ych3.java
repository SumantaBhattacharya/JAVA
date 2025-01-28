interface Animal {
    public abstract void characterstic();

}

interface Terrestrial {
    public void livesin();

}

interface Aquatic {
    void livesin();

}

class fish implements Animal,Terrestrial,Aquatic {

    @Override
    public void characterstic() {
        System.out.println("Machili jal ki rani he, Jeevan uska paani he, Haath Lagao toh dar jayegi, Bahar nikalo toh mar jayegi.");
       
    }// if we impliment other classes then it will be compulsary to provide/override their abstract method by this we make possible of use of multiple inheritance 
    // if we dont impliment the other classes then still we can use their method but it will not be compulsary
    public void livesin() {
        System.out.println("Fish is the queen of water, and water is its life. If you touch it, it gets scared. If you take it out, it dies."); 
    
    }

}


public class Abstrac_Interface_Ych3 {
    public static void main(String[] args) {
        
        fish T1 = new fish ();
        T1.characterstic();
        T1.livesin();
        
// we can use the interface_classname as the reference variable
       /* Animal T2 = new fish();
        T2.characterstic();*/


 
    }
}
