public class PolymorphismApp {
    static void main() {
        Employee employee = new Employee("Yes");
        employee.sayHello("King");

        employee = new Manager("Kautsar");
        employee.sayHello("Adit");

        employee = new VicePresident("Budi");
        employee.sayHello("Tur");
    }
}
