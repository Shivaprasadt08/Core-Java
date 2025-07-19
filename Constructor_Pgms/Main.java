package Constructor_Pgms;

//A shallow copy constructor copies the object reference of mutable fields,-
//-not the actual object, meaning both objects refer to the same memory for those fields.
class Engine {
    String type = "Petrol";
}

class Car {
    String brand;
    Engine engine;

    Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    // Shallow copy constructor
    Car(Car c) {
        this.brand = c.brand;
        this.engine = c.engine; // only reference copied
    }
}

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Car car1 = new Car("Honda", e1);
        Car car2 = new Car(car1); // Shallow copy

        car2.engine.type = "Diesel";

        System.out.println(car1.engine.type); // Diesel (changed due to shared reference)
    }
}

