//// Car class (nested inside SuperK_Vechecle)
    //nested class
public class SuperK2_Car extends SuperK_Vechecle {
    int gear;
     // Constructor for initializing color, weight, and gear
     SuperK2_Car(String colour, double weight, int gear) {
        /*this.colour=colour;
        this.weight=weight;*/
        super(colour, weight);// Call the superclass constructor
        this.gear = gear; // Initialize the gear attribute
 
       }
       // Override the display method to include gear
       @Override
       void display(){
          super.display();
          /*System.out.println("Colour"+colour);
          System.out.println(" Weight:-"+ weight);} */
          System.out.println("Gear"+  gear);
       }
 }
    
    

