package programmer.it.application;

import programmer.it.data.Animal;
import programmer.it.data.Cat;

public class AnimalApp {
    static void main() {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
