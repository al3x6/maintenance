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
        ArrayList<Pixel> pixels = new ArrayList<>();

        int x1 = startPoint.getP_x();
        int y1 = startPoint.getP_y();
        int x2 = endPoint.getP_x();
        int y2 = endPoint.getP_y();

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        int err = dx - dy;

        while (true) {
            pixels.add(new Pixel(x1, y1));
            if (x1 == x2 && y1 == y2) {
                break;
            }
            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }

        return pixels;
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
