class Person {
    String name;
    String address;
    String country2;
    final String country = "Indonesia";

    Person(String paramName) {
        this(paramName, null);
    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName, String paramAddress, String paramCountry) {
        name = paramName;
        address = paramAddress;
        country2 = paramCountry;
    }

    Person(){
        this(null, null);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
