//3
public class Maruti extends Car {
    public Maruti(String name,  boolean isManual) {
        super(name, 4, 5,6, isManual, "SUV");// we are proving gear manually initially our car is standing still not moving! it is to be hardcoded
    }
    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        /* speed = 0: gear=1
         * speed = 0 to 10: gear=1
         * speed = 10 to 20: gear=2
         * speed = 20 to 30: gear=3
         * speed = 30 to 50: gear=4
         *  speed = 50 to 70: gear=5
         *  speed above = 70: gear=6
         */
        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        } else if (newSpeed > 30 && newSpeed <= 50) {
            changeGear(4);
        } else if (newSpeed > 50 && newSpeed <= 70) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}






