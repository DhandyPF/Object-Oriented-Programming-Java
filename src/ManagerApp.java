class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Dhandy");
        manager.sayHello("Irwan");

        var vp = new VicePresident("Dhandy");
        vp.sayHello("Dimas");
    }
}
