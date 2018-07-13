package problem;

/**
 * Determine If Two Rectangles Overlap.
 * <p>
 * Given two axis-aligned rectangles A and B. Write a function to determine if the two rectangles overlap.
 */
public class TwoRectanglesOverlap {

    static class Rectangle {
        private final Coordinate botLeft;
        private final Coordinate topRight;
        private final Coordinate topLeft;
        private final Coordinate botRight;

        public Rectangle(Coordinate botLeft, Coordinate topRight, Coordinate topLeft, Coordinate botRight) {
            this.botLeft = botLeft;
            this.topRight = topRight;
            this.topLeft = topLeft;
            this.botRight = botRight;
        }

        public Coordinate botLeft() {
            return botLeft;
        }

        public Coordinate topRight() {
            return topRight;
        }

        public Coordinate topLeft() {
            return topLeft;
        }

        public Coordinate botRight() {
            return botRight;
        }

        public boolean isOverlaps(Rectangle rectangle) {
            return false;
        }
    }

    static class Coordinate {
        final int x;
        final int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
