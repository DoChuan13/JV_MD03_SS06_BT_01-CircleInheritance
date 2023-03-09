import shape.Circle;
import shape.Cylinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------------------------Circle-------------------------");
        Circle circle = new Circle(5, "Yellow");
        System.out.println("Initial Circle: ==> " + circle);

        System.out.println("\n-------------------------Cylinder-------------------------");
        Cylinder cylinder = new Cylinder(10, "Red", 20);
        System.out.println("Initial Cylinder: ==> " + cylinder);
    }
}
