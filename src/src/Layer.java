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

    public void addShape(Shape shape){
        shapes.add(shape);
        System.out.println("ajout d'une shape");
        return;
    }
    public void removeShape(int id){
        for(Shape shape : shapes){
            if(shape.getId()==id){
                shapes.remove(shape);
                System.out.println("Layer supprimé");
                return;
            }
        }
        System.out.println("Id Layer introuvable");
        return;
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
