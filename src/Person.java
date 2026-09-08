class Person {
    String name;
    String address;
    String country2;
    final String country = "Indonesia";

    Person(String paramName) {
        this(paramName, null);
    }

    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName, String paramAddress, String paramCountry) {
        name = paramName;
        address = paramAddress;
        country2 = paramCountry;
    }

    Person(){
        this(null, null);
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
