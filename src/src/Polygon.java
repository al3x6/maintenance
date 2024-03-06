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

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
