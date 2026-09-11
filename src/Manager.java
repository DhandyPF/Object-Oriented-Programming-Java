class Manager {
    String name;

    String company;

//    Default Constructor
//    Manager(){
//
//    }

    Manager(String name){
        this.name = name;
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }
}
