import java.util.ArrayList;

abstract class Shape {
    private static int nextId = 1;
    private int id;
    int x;
    int y;
    int visible =1;
    ArrayList<Pixel> draw(){
        //
        return null;
    }

    public int getId() {
        return id;
    }
}
