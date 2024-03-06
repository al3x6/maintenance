import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        Point p = new Point(2, 5);
        assertEquals(p.toString(), "Point : 2, 5");
    }

    @org.junit.jupiter.api.Test
    void draw() {

    }
}