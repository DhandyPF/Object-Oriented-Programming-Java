package programmer.it.data;

public class Avanza implements Car{
    public void drive() {
        System.out.println("Avanza Drive");
    }

    public int getTire() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean maintenance() {
        return false;
    }
}
