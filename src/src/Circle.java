import java.util.ArrayList;

class Circle extends Shape {
    private Point center;
    private int radius;


    public Circle(Point c, int r) {
        this.center = c;
        this.radius = r;
    }

    public String toString() {
        return super.toString() + "Circle : " + center + ", radius " + radius;
    }

    @Override
    public ArrayList<Pixel> draw() {
        return null;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
