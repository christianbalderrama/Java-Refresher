class Vehicle {
    protected String brand = "Porsche";
    public String honk() {
        return "Porsche, beep beep!";
    }
}
public class main extends Vehicle {
    public static void main(String[] args) {
        main myCar = new main();
        // We inherit the attributes/functions of a class using the `extends` keyword
        System.out.println(myCar.brand);
        System.out.println(myCar.honk());
    }
}
