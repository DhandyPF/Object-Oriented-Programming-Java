public class PolymorphismApp {
    static void main() {
        Employee employee = new Employee("Yes");
        employee.sayHello("King");

        employee = new Manager("Kautsar");
        employee.sayHello("Adit");

        employee = new VicePresident("Budi");
        employee.sayHello("Tur");

        sayHello(new Employee("Dimas"));
        sayHello(new Employee("Dharma"));
        sayHello(new Employee("Huga"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
