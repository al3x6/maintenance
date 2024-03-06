import java.util.ArrayList;

public abstract class Shape {
    private static int nextId = 1;
    protected int id;
    protected int x;
    protected int y;
    int visible = 1;

    public Shape() {
        this.id = nextId++;
        //this.x = x;
        //this.y = y;
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
