class Manager extends Employee {

    String company;

//    Default Constructor
//    Manager(){
//
//    }

    Manager(String name){
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }
}
