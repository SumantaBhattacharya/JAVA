//2
// Subclass representing a car
public class Car extends Vechicle{
  private int wheels;
  private String type;
  private int doors;
  private int gears;
  private boolean isManual;
  private int CurrentGear;
// genarate constructor
 public Car(String name, int wheels, int doors, int gears,
    boolean isManual, String type) {
    super(name, 0, 0); // Call the parent class constructor with appropriate arguments
    this.type = type;
    this.gears = gears;
    this.doors = doors;
    this.isManual = isManual;
    this.wheels = wheels;
    CurrentGear=1; //hardcode
}

 public int getWheels() {
    return wheels;
 }
 public void setWheels(int wheels) {
    this.wheels = wheels;
 }
 public String getType() {
    return type;
 }
 public void setType(String type) {
    this.type = type;
 }
 public int getDoors() {
    return doors;
 }
 public void setDoors(int doors) {
    this.doors = doors;
 }
 public int getGears() {
    return gears;
 }
 public void setGears(int gears) {
     this.gears = gears;
 }
 public boolean isManual() {
    return isManual;
 }
 public void setManual(boolean isManual) {
    this.isManual = isManual;
 }
 public int getCurrentGear() {
    return CurrentGear;
 }
 public void setCurrentGear(int currentGear) {
    CurrentGear = currentGear;
 }
  // Getter and setter methods for car-specific variables
 public void changeGear(int newGear){
    this.CurrentGear=newGear;
    System.out.println("Changed method called to "+ this.CurrentGear+" gears");
 }
  public void changeSpeed(int newSpeed, int newDirection){
    move(newSpeed, newDirection);
    System.out.println("changed speed method called: speed -->"+newSpeed+"Direction-->"+newDirection);
  }
}
