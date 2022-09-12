/**
 * Author: Christian Balderrama
 * Email: <0christianbalderrama@gmail.com>
 * Date: September 12, 2022
 */

class Animal {

    /**
     * `Encapsulation` is to make sure that `sensitive` data is hidden from the users.
     * and declaring the attributes as `private` make sure that when the object is
     * created it won't be able to modify the values directly.
     *
     * They need to use the `getters/setters` functions to do that action.
     */
    private String type;
    private String name;
    private String color;
    private int age;

    public Animal(){}
    public Animal(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class main {
    public static void main(String[] args) {
        // Creates a dog object with the following attributes
        Animal animal1 = new Animal("Dog", "Klein", "Black/Tan", 3);
        System.out.println("Type: " + animal1.getType() + "\n" + "Name: " + animal1.getName() + "\n" + "Color: " + animal1.getColor() + "\n" + "Age: " + animal1.getAge());
        System.out.println("------------------------");

        // Creates a new object that doesn't provide parameters and set the data manually and fetching the values using the `setters/getters` functions.
        Animal animal2 = new Animal();
        animal2.setName("Catty");
        animal2.setColor("White");
        animal2.setType("Cat");
        animal2.setAge(1);
        System.out.println("Type: " + animal2.getType() + "\n" + "Name: " + animal2.getName() + "\n" + "Color: " + animal2.getColor() + "\n" + "Age: " + animal2.getAge());
    }
}
