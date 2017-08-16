package edu.macalester.comp124.hw0;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Shilad Sen
 */
public class AreaTest {
    @Test
    public void testSquare() {
        assertEquals(Area.getSquareArea(3.0), 9.0, 0.001);
    }

    @Test
    public void testCircle() {
        assertEquals(Area.getCircleArea(3.0), 28.2743, 0.001);
    }
}
