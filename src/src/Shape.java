import java.util.ArrayList;

abstract class Shape {
    private static int nextId = 1;
    protected int id;
    int x;
    int y;
    int visible = 1;

    public Shape() {
        this.id = nextId++;
    }

    public String toString() {
        return "Shape ID : " + id + " => ";
    }

    public ArrayList<Pixel> draw() {
        //
        return null;
    }

    public int getId() {
        return id;
    }
}
