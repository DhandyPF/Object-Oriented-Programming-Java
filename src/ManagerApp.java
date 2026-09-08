class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Dhandy";
        manager.sayHello("Irwan");

        var vp = new VicePresident();
        vp.name = "Dhandy";
        vp.sayHello("Dimas");
    }
}
