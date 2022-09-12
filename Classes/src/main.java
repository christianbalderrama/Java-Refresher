/**
 * Author: Christian Balderrama
 * Email: <0christianbalderrama@gmail.com>
 * Date: September 12, 2022
 */

class Fruit {
    // Attributes declared as public can be accessed/change directly
    public String name;

    public int count = 1;

    // Constructor with name parameter
    Fruit(String name) {
        this.name = name;
    }

    /**
     * `public` functions can only be called when an object is created
     * and `static` declared functions can only be called inside the
     * class and not accessible through the created object.
     */
    public String getName() {
        return name;
    }

    public String callTest() {
        return test();
    }

    /**
     * Can only be called inside the class
     */
    public static String test() {
        return "test() function";
    }
}

public class main {
    public static void main(String[] args) {
        // Creates a fruit object named `Apple`
        Fruit apple = new Fruit("Apple");
        // public attributes can be accessed/change directly
        apple.name = "Pineapple";
        apple.count = 10;

        // This should return `Pineapple` and `10` instead
        System.out.println("Name: " + apple.name);
        System.out.println("Count: " + apple.count);
        System.out.println("------------------------");

        // Modify the attributes again
        apple.name = "Apple";
        apple.count = 0;

        // Should return `Apple`
        System.out.println("Name: " + apple.getName());
        System.out.println(apple.callTest());
    }
}