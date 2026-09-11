public class ShapeApp {
    public static void main() {
        var shape = new Shape();
        System.out.println(shape.GetCorner());

        var rectangle = new Rectangle();
        System.out.println(rectangle.GetCorner());
        System.out.println(rectangle.GetParentCorner());
    }
}