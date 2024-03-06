import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testToString() {
        Point p = new Point(2, 5);
        assertEquals( " Shape ID : 2 => Point : 2, 5 |", p.toString());
    }

    @Test
    void testDraw() {
        Point p = new Point(2, 5);
        ArrayList<Pixel> pixels = p.draw();
        assertEquals(1, pixels.size());
        assertEquals(new Pixel(2, 5), pixels.get(0));
    }

    @Test
    void testGetP_x() {
        Point p = new Point(2, 5);
        assertEquals(2, p.getP_x());
    }

    @Test
    void testGetP_y() {
        Point p = new Point(2, 5);
        assertEquals(5, p.getP_y());
    }

    @Test
    void testSetP_x() {
        Point p = new Point(2, 5);
        p.setP_x(3);
        assertEquals(3, p.getP_x());
    }

    @Test
    void testSetP_y() {
        Point p = new Point(2, 5);
        p.setP_y(6);
        assertEquals(6, p.getP_y());
    }
}