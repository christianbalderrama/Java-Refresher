/**
 * `Interface` is a completely "abstract class" that is used to group related functions
 * with empty bodies.
 */
interface Animal {
    public void animalSound();
    public void sleep();
}

/**
 * To access the functions, the class must be using `implemented` keyword
 * and must implement the functions declared in the `interface` class
 */
class Pig implements Animal {
    public void animalSound() {
        System.out.println("wee wee");
    }

    public void sleep() {
        System.out.println("zzZ");
    }
}
public class main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}
