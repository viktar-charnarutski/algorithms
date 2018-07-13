package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoRectanglesOverlapTest {

    @Test
    public void intersection1_true() {
        TwoRectanglesOverlap.Rectangle recA = new TwoRectanglesOverlap.Rectangle(
                new TwoRectanglesOverlap.Coordinate(1, 1),
                new TwoRectanglesOverlap.Coordinate(3, 4),
                new TwoRectanglesOverlap.Coordinate(1, 4),
                new TwoRectanglesOverlap.Coordinate(3, 1));

        TwoRectanglesOverlap.Rectangle recB = new TwoRectanglesOverlap.Rectangle(
                new TwoRectanglesOverlap.Coordinate(2, 3),
                new TwoRectanglesOverlap.Coordinate(4, 6),
                new TwoRectanglesOverlap.Coordinate(2, 6),
                new TwoRectanglesOverlap.Coordinate(4, 3));

        assertTrue(recA.isOverlaps(recB));
    }

    @Test
    public void intersection1_false() {
        TwoRectanglesOverlap.Rectangle recA = new TwoRectanglesOverlap.Rectangle(
                new TwoRectanglesOverlap.Coordinate(1, 1),
                new TwoRectanglesOverlap.Coordinate(2, 2),
                new TwoRectanglesOverlap.Coordinate(2, 1),
                new TwoRectanglesOverlap.Coordinate(1, 2));

        TwoRectanglesOverlap.Rectangle recB = new TwoRectanglesOverlap.Rectangle(
                new TwoRectanglesOverlap.Coordinate(2, 3),
                new TwoRectanglesOverlap.Coordinate(4, 6),
                new TwoRectanglesOverlap.Coordinate(6, 2),
                new TwoRectanglesOverlap.Coordinate(4, 3));

        assertFalse(recA.isOverlaps(recB));
    }


    @Test
    public void intersection2_true() {
        TwoRectanglesOverlap.Rectangle recA = new TwoRectanglesOverlap.Rectangle(
                new TwoRectanglesOverlap.Coordinate(6, 1),
                new TwoRectanglesOverlap.Coordinate(8, 4),
                new TwoRectanglesOverlap.Coordinate(6, 4),
                new TwoRectanglesOverlap.Coordinate(8, 1));

        TwoRectanglesOverlap.Rectangle recB = new TwoRectanglesOverlap.Rectangle(
                new TwoRectanglesOverlap.Coordinate(5, 3),
                new TwoRectanglesOverlap.Coordinate(7, 6),
                new TwoRectanglesOverlap.Coordinate(5, 6),
                new TwoRectanglesOverlap.Coordinate(7, 3));

        assertTrue(recA.isOverlaps(recB));
    }

}