import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        System.out.println("Execution\n---------------------------------------------------------");
        //Points
        Point p1 = new Point(4, 8);
        Point p2 = new Point(7, 5);
        Point p3 = new Point(5, 6);
        Point p4 = new Point(8, 4);
        Point p5 = new Point(1, 7);

        // Listes de points
        List<Point> lp = new ArrayList<>();
        lp.addAll(Arrays.asList(p1, p2, p3, p4));

        List<Point> lp2 = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));

        //Ligne
        Line l1 = new Line(p1, p2);

        //Carre
        Square s1 = new Square(p2, 3);

        //Rectangle
        Rectangle r1 = new Rectangle(p1, 5, 4);

        //Cercle
        Circle c1 = new Circle(p1, 6);

        //Curve
        Curve cu1 = new Curve(lp);

        //Polygon
        Polygon po1 = new Polygon(lp2);

        //Affichage de chaque shape
        System.out.println(p1);
        System.out.println(l1);
        System.out.println(s1);
        System.out.println(r1);
        System.out.println(c1);
        System.out.println(cu1);
        System.out.println(po1);

        //Layer
        Layer layer1 = new Layer(Arrays.asList(p1, r1, cu1));
        Layer layer2 = new Layer(Arrays.asList(r1, p2, p4, c1));

        //Screen
        Screen screen1 = new Screen(8, 4);
        System.out.println("Affichage\n---------------------------------------------------------");
        System.out.println(screen1);

        //Ajout de layer
        screen1.addLayer(layer1);
        screen1.addLayer(layer2);
        screen1.showLayers();
        screen1.removeLayer(1);
        screen1.showLayers();

    }
}

