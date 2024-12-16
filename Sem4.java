public class Sem4 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Calls Dog's sound method

        animal = new Cat();
        animal.sound(); // Calls Cat's sound method

        // Cannot instantiate Animal directly if it's abstract
        // animal = new Animal();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
