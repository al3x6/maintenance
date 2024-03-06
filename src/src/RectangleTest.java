import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Point topLeft = new Point(2, 3);
        Rectangle rectangle = new Rectangle(topLeft, 4, 5);
        String expected = "Shape ID: 1 => Rectangle : Point : 2, 3, width 4, hauteur 5";
        assertEquals(expected, rectangle.toString());
    }
}