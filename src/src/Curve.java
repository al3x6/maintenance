import java.util.ArrayList;
import java.util.List;

public class Curve extends Shape {
    private List<Point> controlPoints = new ArrayList<>();

    public Curve(List<Point> lp) {
        if (lp.size() != 4) {
            System.out.println("Un curve doit contenir uniquement 4 elements");
        } else {
            this.controlPoints = lp;
        }
    }

    public String toString() {
        String str = "Curve : ";
        for (Point element : controlPoints) {
            str += element.toString() + " ";
        }
        return super.toString() + str;
    }

    public ArrayList<Pixel> draw() {
        ArrayList<Pixel> pixels = new ArrayList<>();

        // Calculer les positions des pixels de la courbe de Bézier
        for (double t = 0.0; t <= 1.0; t += 0.01) {
            double x = Math.pow(1 - t, 3) * controlPoints.get(0).getP_x() +
                    3 * Math.pow(1 - t, 2) * t * controlPoints.get(1).getP_x() +
                    3 * (1 - t) * Math.pow(t, 2) * controlPoints.get(2).getP_x() +
                    Math.pow(t, 3) * controlPoints.get(3).getP_x();
            double y = Math.pow(1 - t, 3) * controlPoints.get(0).getP_y() +
                    3 * Math.pow(1 - t, 2) * t * controlPoints.get(1).getP_y() +
                    3 * (1 - t) * Math.pow(t, 2) * controlPoints.get(2).getP_y() +
                    Math.pow(t, 3) * controlPoints.get(3).getP_y();

            // Ajouter le pixel calculé à la liste de pixels de la forme Curve
            pixels.add(new Pixel((int) Math.round(x), (int) Math.round(y)));
        }

        return pixels;
    }

    public List<Point> getControlPoints() {
        return controlPoints;
    }

    public void setControlPoints(List<Point> controlPoints) {
        this.controlPoints = controlPoints;
    }
}