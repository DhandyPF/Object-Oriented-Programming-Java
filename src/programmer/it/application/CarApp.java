package programmer.it.application;

import programmer.it.data.Avanza;
import programmer.it.data.Car;

public class CarApp {
    static void main() {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
