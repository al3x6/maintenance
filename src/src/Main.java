import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        System.out.println("Execution\n---------------------------------------------------------");
        /*
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
/*
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

*/

        // Créer une instance de la classe Screen
        Screen screen = new Screen(40, 20);
        System.out.println(screen);

        // Créer une instance de la classe Layer
        Layer layer = new Layer();


        Scanner scanner = new Scanner(System.in);



        Scanner sc = new Scanner(System.in);
        String choix = "menu";
        String choix2 = "null";

        while (true) {
            if (choix.equals("quit")){
                break;
            }
            if (choix.equals("menu")) {
                System.out.println("""
                        Veuillez choisir une action :\s
                        A - Ajouter une forme\s
                        B - Afficher la liste des formes\s
                        C - Supprimer une forme\s
                        D - Afficher le dessin
                        F - Quitter""");
                choix2 = sc.nextLine();
                while(true){
                    System.out.println("Vous avez saisi : " + choix);
                    if (choix2.equals("F")) {
                        choix = "quit";
                        break;
                    }
                    if (choix2.equals("A")) {
                        System.out.println("""
                            Quelle forme voulez-vous ajouter ?\s
                            1 - Un Point\s
                            2 - Une Ligne\s
                            3 - Un Cercle\s
                            4 - Un Carre\s
                            5 - Un Rectangle\s
                            6 - Un Polygone\s
                            7 - Une Curve\s
                            8 - Revenir au menu précédent""");
                        choix2 = sc.nextLine();
                        System.out.println("\nVous avez saisi : " + choix2);
                        if (choix2.equals("8")) {
                            choix = "menu";
                            choix2 = "";
                            break;
                        }
                        if (choix2.equals("1")) {
                            System.out.println("Entrez coordonnées x :");
                            int choixX = Integer.parseInt(sc.nextLine());

                            System.out.println("Entrez coordonnées y :");
                            int choixY = Integer.parseInt(sc.nextLine());

                            Point p = new Point(choixX, choixY);

                            layer.addShape(p);
                            screen.addLayer(layer);
                            System.out.println(screen);

                            choix = "menu";
                            choix2 = "null";
                            break;
                        }
                        if (choix2.equals("2")) {
                            System.out.println("Entrez coordonnées x du premier point :");
                            int choixX = Integer.parseInt(sc.nextLine());

                            System.out.println("Entrez coordonnées y du premier point:");
                            int choixY = Integer.parseInt(sc.nextLine());

                            Point p = new Point(choixX, choixY);

                            System.out.println("Entrez coordonnées x du deuxième point :");
                            choixX = Integer.parseInt(sc.nextLine());

                            System.out.println("Entrez coordonnées y du deuxième point:");
                             choixY = Integer.parseInt(sc.nextLine());

                            Point p2 = new Point(choixX, choixY);
                            Line l=new Line(p,p2);

                            layer.addShape(l);
                            screen.addLayer(layer);
                            System.out.println(screen);

                            choix = "menu";
                            choix2 = "null";
                            break;
                        }
                        if (choix2.equals("3")) {
                            System.out.println("Entrez coordonnées x du premier point :");
                            int choixX = Integer.parseInt(sc.nextLine());

                            System.out.println("Entrez coordonnées y du premier point:");
                            int choixY = Integer.parseInt(sc.nextLine());

                            Point p = new Point(choixX, choixY);

                            System.out.println("Entrez le rayon :");
                            int rayon = Integer.parseInt(sc.nextLine());

                            Circle c = new Circle(p,rayon);

                            layer.addShape(c);
                            screen.addLayer(layer);
                            System.out.println(screen);

                            choix = "menu";
                            choix2 = "null";
                            break;
                        }
                        if (choix2.equals("4")) {
                            System.out.println("Entrez coordonnées x :");
                            int choixX = Integer.parseInt(sc.nextLine());

                            System.out.println("Entrez coordonnées y :");
                            int choixY = Integer.parseInt(sc.nextLine());

                            Point p = new Point(choixX, choixY);

                            System.out.println("Entrez width :");
                            int width = Integer.parseInt(sc.nextLine());

                            Square s = new Square(p,width);
                            layer.addShape(s);
                            screen.addLayer(layer);
                            System.out.println(screen);

                            choix = "menu";
                            choix2 = "null";
                            break;
                        }
                        if (choix2.equals("5")) {
                            System.out.println("Entrez coordonnées x :");
                            int choixX = Integer.parseInt(sc.nextLine());

                            System.out.println("Entrez coordonnées y :");
                            int choixY = Integer.parseInt(sc.nextLine());

                            Point p = new Point(choixX, choixY);

                            System.out.println("Entrez width :");
                            int width = Integer.parseInt(sc.nextLine());

                            System.out.println("Entrez height :");
                            int height = Integer.parseInt(sc.nextLine());

                            Rectangle r = new Rectangle(p,width,height);
                            layer.addShape(r);
                            screen.addLayer(layer);
                            System.out.println(screen);

                            choix = "menu";
                            choix2 = "null";
                            break;
                        }
                        if (choix2.equals("6")) {
                            ArrayList<Point> lp = new ArrayList<>();
                            System.out.println("Combien voulez-vous de points ?");
                            int nbrP = Integer.parseInt(sc.nextLine());
                            for(int i =0;i<nbrP; i++){
                                System.out.println("Entrez coordonnées x du point numéro "+(i+1)+" :");
                                int choixX = Integer.parseInt(sc.nextLine());
                                System.out.println("Entrez coordonnées y du point numéro "+(i+1)+" :");
                                int choixY = Integer.parseInt(sc.nextLine());
                                Point p = new Point(choixX,choixY);
                                lp.add(p);
                            }

                            Polygon p = new Polygon(lp);
                            layer.addShape(p);
                            screen.addLayer(layer);
                            System.out.println(screen);

                            choix = "menu";
                            choix2 = "null";
                            break;
                        }
                        if (choix2.equals("7")) {
                            ArrayList<Point> lp = new ArrayList<>();
                            for(int i =0;i<4; i++){
                                System.out.println("Entrez coordonnées x du point numéro "+(i+1)+" :");
                                int choixX = Integer.parseInt(sc.nextLine());
                                System.out.println("Entrez coordonnées y du point numéro "+(i+1)+" :");
                                int choixY = Integer.parseInt(sc.nextLine());
                                Point p = new Point(choixX,choixY);
                                lp.add(p);
                            }

                            Curve c = new Curve(lp);
                            layer.addShape(c);
                            screen.addLayer(layer);
                            System.out.println(screen);

                            choix = "menu";
                            choix2 = "null";
                            break;
                        }
                        else{
                            System.out.println("\n !!! Choix invalide !!!\n");
                            choix2 = "A";
                        }
                    }
                    if(choix2.equals("B")){
                        screen.showLayers();
                        layer.showShapes();
                        break;
                    }
                    if(choix2.equals("C")){
                        System.out.println("Quelle forme(ID) voulez-vous supprimer ? (\"No\" to quit)");
                        String suppShape = sc.nextLine();
                        if(suppShape.equals("No")){
                            break;
                        }
                        layer.removeShape(parseInt(suppShape));
                        break;
                    }
                    if(choix2.equals("D")){
                        System.out.println(screen);
                        break;
                    }
                    else{
                        System.out.println("\n !!! Choix invalide !!!\n");
                        break;
                    }
                }
            }
            else {
                System.out.println("\n !!! Choix invalide !!!\n");
            }
        }
    }
}

