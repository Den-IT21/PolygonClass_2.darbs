//Students: Dainis-Deniss Kurlankovs ( 191RDK003 )
import java.awt.Point;
public class Polygon {
    private static class Vertex {
        public final int x;
        public final int y;
        public Vertex next;

        public Vertex(int x, int y, Vertex next) {
            this.x = x;
            this.y = y;
            this.next = next;
        }
    }

    private Vertex head;
    private int size;

    public Polygon() {
        this.head = null;
        this.size = 0;
    }

    public void add(Point p) {
        this.head = new Vertex(p.x, p.y, this.head);
        this.size++;
    }

    public Point getVertex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        Vertex current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return new Point(current.x, current.y);
    }

    public void delete(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            this.head = this.head.next;
        } else {
            Vertex prev = this.head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }

        this.size--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");

        Vertex current = this.head;
        while (current != null) {
            sb.append(current.x);
            sb.append(", ");
            sb.append(current.y);
            if (current.next != null) {
                sb.append(") (");
            } else {
                sb.append(")");
            }
            current = current.next;
        }

        return sb.toString();
    }
}