import java.util.ArrayList;
import java.util.Collections;
public class main {
    public static void main(String[] args) {
        // ArrayList are `dynamically size array`
        ArrayList<String> cars = new ArrayList<String>(); // Creates an ArrayList Object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Loop through
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + ", ");
        }
        System.out.println();

        // Fancier Loop
        for (String car : cars) {
            System.out.print(car + ", ");
        }
        System.out.println();

        // Sort
        Collections.sort(cars);
        System.out.println(cars);


        // Access an index
        System.out.println(cars.get(0));

        // Change an item
        cars.set(0, "Porsche");
        System.out.println(cars.get(0));

        // Remove an item
        cars.remove(0);
        System.out.println(cars.get(0));

        // ArrayList Size
        System.out.println(cars.size());

        // Remove all items
        cars.clear();
    }
}
