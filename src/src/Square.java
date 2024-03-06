import java.util.ArrayList;

public class Square extends Shape {
    private Point topLeft;
    private int length;

    public Square(Point p, int l) {
        this.topLeft = p;
        this.length = l;
    }

    public String toString() {
        return super.toString() + "Square : " + topLeft + ", width " + length;
    }

    public ArrayList<Pixel> draw() {
        ArrayList<Pixel> pixels = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                pixels.add(new Pixel(topLeft.getP_x() + i, topLeft.getP_y() + j));
            }
        }
        return pixels;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public int getLength() {
        return length;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
