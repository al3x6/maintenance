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

    public ArrayList<Pixel> draw() {
        ArrayList<Pixel> pixels = new ArrayList<>();

        int x = 0;
        int y = radius;
        int d = 3 - (2 * radius);

        while (y >= x) {
            pixels.add(new Pixel(center.getP_x() + x, center.getP_y() + y));
            pixels.add(new Pixel(center.getP_x() + y, center.getP_y() + x));
            pixels.add(new Pixel(center.getP_x() - x, center.getP_y() + y));
            pixels.add(new Pixel(center.getP_x() - y, center.getP_y() + x));
            pixels.add(new Pixel(center.getP_x() + x, center.getP_y() - y));
            pixels.add(new Pixel(center.getP_x() + y, center.getP_y() - x));
            pixels.add(new Pixel(center.getP_x() - x, center.getP_y() - y));
            pixels.add(new Pixel(center.getP_x() - y, center.getP_y() - x));

            if (d < 0) {
                d += 4 * x + 6;
            } else {
                d += 4 * (x - y) + 10;
                y--;
            }
            x++;
        }
        return pixels;
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
