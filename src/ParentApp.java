class ParentApp {
    static void main() {
        Child child = new Child();
        child.name = "Dimas";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
