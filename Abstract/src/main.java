/**
 * The animalSound function is a generic function that can be used by multiple classes
 * using the extends keyword the classes are inherited and are required to be
 * implemented in the subClass.
 */
abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("ZzzzZ");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Arf arf!");
    }
}

public class main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Dog dog = new Dog();

        pig.animalSound();
        dog.animalSound();
    }
}
