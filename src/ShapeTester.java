import shapes.*;
import java.util.*;

public class ShapeTester {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(ShapeFactory.createShape("circle", 5));
        shapes.add(ShapeFactory.createShape("rectangle", 5, 2));
        shapes.add(ShapeFactory.createShape("triangle", 5, 2));
        shapes.add(ShapeFactory.createShape("triangle", 5, 2, 50));

        for (Shape s : shapes) {
            System.out.println(s.getName() + " area: " + s.getArea());
        }
    }
}
