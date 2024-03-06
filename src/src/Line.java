import java.util.ArrayList;

public class Line extends Shape {
    private Point startPoint;
    private Point endPoint;

    public Line(Point s, Point e) {
        this.startPoint = s;
        this.endPoint = e;
    }

    public String toString() {
        return super.toString() + "Line : " + startPoint + ", " + endPoint;
    }

    public ArrayList<Pixel> draw() {
        return null;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}
