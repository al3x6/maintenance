import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    private static int nextId = 1;
    private int id;
    private List<Shape> shapes;

    /**
     * Instancie un Layer avec une liste de shapes vide
     * */
    public Layer(){
        this.id = nextId++;
        this.shapes = new ArrayList<>();
    }
    /**
     * Instancie un Layer contenant une liste de shapes déjà faite
     * @param shapes Liste de shapes
     * */
    public Layer(List<Shape> shapes){
        this.id = nextId++;
        this.shapes = shapes;
    }

    /**
     * Ajoute un shape dans la liste de shapes d'un Layer
     * @param shape Shape à ajouter
     * */
    public void addShape(Shape shape){
        shapes.add(shape);
        System.out.println("Screen ID : "+ id +" | Layer ID : "+ shape.getId()+" ajouté");
    }
    /**
     * Supprime un Shape de la liste de shapes d'un Layer
     * @param id ID du shape à supprimer
     * */
    public void removeShape(int id){
        for(Shape shape : shapes){
            if(shape.getId()==id){
                shapes.remove(shape);
                System.out.println("Shape ID : "+ id +" supprimé");
                return;
            }
        }
        System.out.println("Layer ID introuvable");
    }
    /**
     * Affiche la liste de shapes d'un Layer
     * */
    public void showShapes(){
        System.out.println("Affichage des Layers");
        for(Shape shape :shapes){
            System.out.println("Layer ID: "+shape.getId() + " | " + shape);
        }
    }

    public int getId() {
        return id;
    }
    public List<Shape> getShapes(){
        return shapes;
    }
    public String toString(){
        return String.valueOf(id);
    }


}
