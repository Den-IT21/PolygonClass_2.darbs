import org.junit.Test;
import java.awt.Point;
public class PolygonConsoleDemo {
    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        System.out.println("Empty: " + polygon);

        polygon.add(new Point(1, 2));
        polygon.add(new Point(3, 10));
        polygon.add(new Point(5, 4));
        System.out.println("Triangle: " + polygon);

        polygon.delete(0);
        System.out.println("Segment: " + polygon);

        System.out.println("First vertex: " + polygon.getVertex(0));

        System.out.println("Get missing vertex");
        polygon.getVertex(5);
    }
}

/*
Empty: Empty polygon
Triangle: (1, 2) (3, 10) (5, 4)
Segment: (3, 10) (5, 4)
First vertex: (3, 10)
Get missing vertex
Exception in thread "main" java.lang.IndexOutOfBoundsException
    at Polygon.getVertex(Polygon.java:55)
    at PolygonConsoleDemo.main(PolygonConsoleDemo.java:19)
*/
