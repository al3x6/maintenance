import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

class Main{
    public static void main(String[]args){
        System.out.println("Execution\n---------------------------------------------------------");

        Point p1 = new Point(4,8);
        Point p2 = new  Point(7,5);
        Point p3 = new Point(5,6);
        Point p4 = new Point(8,4);
        Point p5 = new Point(1,7);

        System.out.println(p1.toString());

        Rectangle r1 = new Rectangle(p1,5,4);
        System.out.println(r1.toString());

        Circle c1 = new Circle(p1,6);
        System.out.println(c1.toString());

        Line l1 = new Line(p1,p2);
        System.out.println(l1);

        Square s1 = new Square(p2 , 3);
        System.out.println(s1);

        Point [] lp = {p1, p2, p3,p4};
        Curve cu1 = new Curve(lp);
        System.out.println(cu1);

        Point [] lp2 = {p1, p2, p3,p4, p5};
        Polygon po1 = new Polygon(lp2);
        System.out.println(po1);
    }
}

