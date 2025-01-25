
    // Animal interface
interface Animal {
    void sound();
}

// Subclasses implementing the interface
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Tiger implements Animal {
    @Override
    public void sound() {
        System.out.println("Roar");
    }
}

class Elephant implements Animal {
    @Override
    public void sound() {
        System.out.println("Trumpet");
    }
}

class Horse implements Animal {
    @Override
    public void sound() {
        System.out.println("Neigh");
    }
}

// Main class
public class Main_A5 {
    public static void main(String[] args) {
        // Create objects of the implementing classes
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal elephant = new Elephant();
        Animal horse = new Horse();

        // Call the sound method for each animal
        cat.sound();
        dog.sound();
        tiger.sound();
        elephant.sound();
        horse.sound();
    }
}
/*In this code, the Animal interface defines a contract with a single method sound(). The implementing classes (Cat, Dog, Tiger, Elephant, and Horse) provide their own implementation of the sound method. The Main class demonstrates polymorphism by creating objects of the Animal interface type and calling the sound method for each animal.*/


