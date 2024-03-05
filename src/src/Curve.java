import java.util.ArrayList;
import java.util.List;

public class Curve extends Shape{
    private List<Point> controlPoints = new ArrayList<>();

    public Curve(List<Point> lp){
        if(lp.size() != 4){
            System.out.println("Un curve doit contenir uniquement 4 elements");
        }
        else{
            this.controlPoints  = lp;
        }

    }

    public String toString(){
        String str = "Curve : ";
        for(Point element : controlPoints){
            str += element.toString() + " ";
        }
        return super.toString()+str;
    }


    public List<Point> getControlPoints() {
        return controlPoints;
    }

    public void setControlPoints(List<Point> controlPoints) {
        this.controlPoints = controlPoints;
    }
}