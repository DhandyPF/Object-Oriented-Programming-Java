public class PersonApp {
    static void main() {
        var person1 = new Person("Dhandy", "Cirebon");
//        person1.country = "India";
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("A");

        Person person2 = new Person("Budi", "Kuningan");

//        Person person3;
//        person3 = new Person();

//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
    }
}