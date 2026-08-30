public class PersonApp {
    static void main() {
        var person1 = new Person();
        person1.name = "Dhandy";
        person1.address = "Cirebon";
//        person1.country = "India";
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();

        Person person3;
        person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}