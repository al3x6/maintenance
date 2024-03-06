import java.util.ArrayList;

class Point extends Shape {
    private int p_x;
    private int p_y;

    public Point(int x, int y) {
        //super(x, y);
        this.p_x = x;
        this.p_y = y;
    }

    public String toString() {
        return super.toString() + "Point : " + p_x + ", " + p_y + " |";
    }

    public ArrayList<Pixel> draw() {
        ArrayList<Pixel> pixels = new ArrayList<>();
        pixels.add(new Pixel(p_x, p_y));
        return pixels;
    }

    public int getP_x() {
        return p_x;
    }

    public int getP_y() {
        return p_y;
    }

    public void setP_x(int p_x) {
        this.p_x = p_x;
    }

    public void setP_y(int p_y) {
        this.p_y = p_y;
    }
}
