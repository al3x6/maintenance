import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape {
    private List<Point> points;


    public Polygon(List<Point> p) {
        this.points = p;
    }

    public String toString() {
        String str = "Polygon : ";
        for (Point element : points) {
            str += element.toString() + " ";
        }
        return super.toString() + str;
    }

    public ArrayList<Pixel> draw() {
        ArrayList<Pixel> pixels = new ArrayList<>();

        // Parcourir tous les segments de ligne qui composent le polygone
        for (int i = 0; i < points.size() - 1; i++) {
            // Dessiner chaque segment de ligne
            Line segment = new Line(points.get(i), points.get(i + 1));
            pixels.addAll(segment.draw());
        }

        // Dessiner le dernier segment de ligne entre le dernier point et le premier point
        Line lastSegment = new Line(points.get(points.size() - 1), points.get(0));
        pixels.addAll(lastSegment.draw());

        return pixels;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
