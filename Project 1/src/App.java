//4
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Maruti car= new Maruti("Maruti",false);
        car.move(80, 45);
        car.accelerate(30);
        System.out.println("currentgear:"+car.getCurrentGear());
        System.out.println("current speed:"+car.getCurrentSpeed());
    }
}
