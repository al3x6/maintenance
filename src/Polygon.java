import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape{
    private Point [] points;


    public Polygon(Point [] p){
        this.points = p;
    }

    public String toString(){
        String str = "Polygon : ";
        for(Point element : points){
            str += element.toString() + " ";
        }
        return str;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }
}