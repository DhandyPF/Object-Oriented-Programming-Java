class PersonApp {
    static void main() {
        var person1 = new Person("Dhandy", "Cirebon");
//        person1.country = "India";
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("A");

        Person person2 = new Person("Putra", "Kuningan");
        System.out.println(person2.name);
        System.out.println(person2.address);
        person2.sayHello("B");

        Person person3;
        person3 = new Person();
        person3.name = "Fahruddin";
        System.out.println(person3.name);
        person3.sayHello("C");

        Person person4 = new Person("Putri", "Purbalingga", "Indonesia");
    }
}