class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Dhandy";
        manager.sayHello("Putra");

        var vp = new VicePresident();
        vp.name = "Dhandy";
        vp.sayHello("Putra");
    }
}
