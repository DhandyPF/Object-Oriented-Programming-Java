package programmer.it.application;

import programmer.it.data.City;
import programmer.it.data.Location;

public class LocationApp {
    static void main() {
//        var location = new Location();
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
