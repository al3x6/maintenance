import java.util.ArrayList;

public class Curve extends Shape{
    private Point [] controlPoints = new Point[4];

    public Curve(Point[] lp){
        if(lp.length != 4){
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
        return str;
    }


    public Point[] getControlPoints() {
        return controlPoints;
    }

    public void setControlPoints(Point[] controlPoints) {
        this.controlPoints = controlPoints;
    }
}