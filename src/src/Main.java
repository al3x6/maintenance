import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        System.out.println("Execution\n---------------------------------------------------------");
        /**
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
        */

        /////////////////////////////////////////////////// FORME
        /////////////////// POINT
        // Créer une instance de la classe Point
        Point point = new Point(5, 5);

        /////////////////// LIGNE
        //Créer deux Point
        Point pligne1 = new Point(1, 1);
        Point pligne2 = new Point(5, 6);
        // Créer une Ligne
        Line ligne = new Line(pligne1, pligne2);

        /////////////////// CERCLE
        // Créer un Point
        Point center = new Point(6, 6);
        // Créer un cercle
        Circle cercle = new Circle(center, 4);

        /////////////////// CARRE
        // Créer un Point
        Point pCarre = new Point(5, 5);
        // Créer un carré
        Square carre = new Square(pCarre, 4);

        /////////////////// Rectangle
        // Créer un point pour le coin supérieur gauche du rectangle
        Point pRectangle = new Point(2, 3);
        // Créer un rectangle
        Rectangle rectangle = new Rectangle(pRectangle, 4, 5);

        /////////////////// Polygone
        // Créer une liste de points pour le polygone
        List<Point> pPoly = new ArrayList<>();
        pPoly.add(new Point(2, 2));
        pPoly.add(new Point(4, 0));
        pPoly.add(new Point(6, 2));
        pPoly.add(new Point(5, 5));
        pPoly.add(new Point(2, 5));
        // Créer un Polygone
        Polygon polygone = new Polygon(pPoly);

        /////////////////// Courbe Bézier
        // Créer une liste de points pour la courbe
        List<Point> controlPoints = new ArrayList<>();
        controlPoints.add(new Point(2, 2));
        controlPoints.add(new Point(5, 2));
        controlPoints.add(new Point(5, 5));
        controlPoints.add(new Point(2, 5));

        // Créer une instance de la classe Curve
        Curve curve = new Curve(controlPoints);

        /////////////////////////////////////////////////// LAYER
        // Créer une instance de la classe Layer
        Layer layer = new Layer();
        // Ajoute la forme Point au layer
        layer.addShape(cercle);
        //layer.addShape(ligne);

        /////////////////////////////////////////////////// SCREEN
        // Créer une instance de la classe Screen
        Screen screen = new Screen(15, 15);
        // Ajoute le layer à l'écran
        screen.addLayer(layer);
        // Dessine les formes sur l'écran
        screen.dessin();
        // Afficher l'écran
        System.out.println(screen);


        /**
        // Créer une instance de la classe Screen
        Screen screen = new Screen(20, 5);
        System.out.println(screen);

        // Créer une instance de la classe Layer
        Layer layer = new Layer();

        Scanner sc = new Scanner(System.in);
        String choix = "menu";
        String choix2 = "null";

        while (choix != "quit"){
            if (choix == "menu")
                System.out.println("Veuillez choisir une action : \n" +
                        "A - Ajouter une forme \n" +
                        "B - Afficher la liste des formes \n" +
                        "C - Supprimer une forme \n" +
                        "D - Tracer le dessin" +
                        "E - Aide\n" +
                        "F - Quitter");
            choix = sc.nextLine();
            System.out.println("Vous avez saisi : " + choix);
            if (choix.equals("A")){
                System.out.println("Quelle forme voulez-vous ajouter ? \n" +
                        "1 - Un Point \n" +
                        "2 - Une Ligne \n" +
                        "3 - Un Cercle \n" +
                        "4 - Un Carre \n" +
                        "5 - Un Rectangle \n" +
                        "6 - Un Polygone \n" +
                        "7 - Revenir au menu précédent");
                choix2 = sc.nextLine();
                System.out.println("Vous avez saisi : " + choix2);
                if(choix2.equals("7")){
                    break;
                }
                else if(choix2.equals("1")){
                    System.out.println("Entrez coordonnées x : \n");
                    int choixX = Integer.parseInt(sc.nextLine());
                    System.out.println("Entrez coordonnées y : \n");
                    int choixY = Integer.parseInt(sc.nextLine());

                    Point p = new Point(choixX,choixY);

                    layer.addShape(p);

                    screen.addLayer(layer);

                    screen.dessin();
                    System.out.println(screen);
                    continue;
                }
            }
            else {
                System.out.println("Choix invalide : \n");
                continue;
            }
        }*/



    }
}

