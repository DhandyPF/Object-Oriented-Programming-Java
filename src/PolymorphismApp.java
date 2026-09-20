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
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
