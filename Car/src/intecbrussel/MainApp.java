package intecbrussel;

public class MainApp {

    public static void main(String[] args) {

        // Creëert myCar object
        Car myCar = new Car();

        Bicycle bike = new Bicycle();

        // Drukt de waarde af van type of vehicle van Vehicle class en brandname van Car class.
        System.out.println("This vehicle is an: " + myCar.getTypeOfVehicle() +
                "\nThe brand is: " + myCar.getBrandName());
    }
}