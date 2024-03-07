import java.util.ArrayList;
import java.util.List;

public class Screen {
    private static int nextId = 1;

    private int id;
    private int length;
    private int width;
    private List<Layer> layers;

    private String[][] zoneDessin;

    public Screen(int width, int length) {
        this.id = nextId++;
        this.width = width;
        this.length = length;
        this.layers = new ArrayList<>();
        this.zoneDessin = init(width, length);
        System.out.println("Création Screen");
    }

    /**
     * Crée un tableau à deux dimensions de chaînes de caractères avec une
     * largeur et une longueur spécifiées. Chaque élément du tableau est initialisé avec
     * la valeur "0".
     *
     * @param width  La largeur du tableau à créer.
     * @param length La longueur du tableau à créer.
     * @return Un tableau à deux dimensions de chaînes de caractères initialisé avec des zéros.
     */
    private String[][] init(int width, int length) {
        String[][] tableau = new String[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                tableau[i][j] = "0";
            }
        }
        System.out.println("Initialisation Screen");
        return tableau;
    }

    public String toString() {
        dessin();
        String str = "";
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (zoneDessin[i][j].equals("1")){
                    zoneDessin[i][j] = "#";
                    //str+="#";
                }else{
                    zoneDessin[i][j]=".";
                }
                str += zoneDessin[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }

    public void dessin() {
        /*
         for layer : layers
         if layer is not visible
         continue
         for shape : shapes (un layer contient des shapes)
         shape.draw() (implémenter les algo draw, modifie la zoneDessin)
         */
        System.out.println("Voici votre desssin ! ");
        // Pour chaque Layer
        for (Layer layer : layers) {
            // Pour chaque shape dans le layer
            for (Shape shape : layer.getShapes()) {
                ArrayList<Pixel> pixels = shape.draw();     // Implémenter draw()

                // Remplacer les 0 par des 1 dans la matrice aux positions des pixels
                for (Pixel pixel : pixels) {
                    int x = pixel.getX();
                    int y = pixel.getY();
                    if (x >= 0 && x < width && y >= 0 && y < length) {    //pas obligé car bordure extensible
                        zoneDessin[y][x] = "1";
                    }
                }
            }
        }
    }

    /**
     * Ajoute un layer dans la liste de layers d'un Layer
     *
     * @param layer Layer à ajouter
     */
    public void addLayer(Layer layer) {
        layers.add(layer);
        System.out.println("Screen ID : " + id + " | Layer ID : " + layer.getId() + " ajouté");
    }

    /**
     * Supprime un Layer de la liste de layers d'un Screen
     *
     * @param id ID du Layer à supprimer
     */
    public void removeLayer(int id) {
        for (Layer layer : layers) {
            if (layer.getId() == id) {
                layers.remove(layer);
                System.out.println("Layer ID : " + id + " supprimé");
                return;
            }
        }
        System.out.println("Layer ID introuvable");
        return;
    }

    /**
     * Affiche la liste de layers d'un Screen
     */
    public void showLayers() {
        System.out.println("Affichage des Layers");
        for (Layer layer : layers) {
            System.out.println("Layer ID: " + layer.getId() + " | " + layer.getShapes().size() + " shape(s)");
        }
        return;
    }

}
