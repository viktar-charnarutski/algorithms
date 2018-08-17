package problem;

/**
 * 223. Rectangle Area
 * <p>
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * <p>
 * Each rectangle is defined by its bottom left corner and top right corner.
 */
public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        Rectangle rec1 = new Rectangle(new Point(A, B), new Point(C, D));
        Rectangle rec2 = new Rectangle(new Point(E, F), new Point(G, H));
        return rec1.totalArea(rec2);
    }

    class Rectangle {
        private final Point bottomLeft;
        private final Point topRight;

        public Rectangle(Point bottomLeft, Point topRight) {
            this.bottomLeft = bottomLeft;
            this.topRight = topRight;
        }

        public int area() {
            return bottomSide() * leftSide();
        }

        int bottomSide() {
            return side(topRight.getX(), bottomLeft.getX());
        }

        int leftSide() {
            return side(topRight.getY(), bottomLeft.getY());
        }

        private int side(int p1, int p2) {
            if (p1 < 0 || p2 < 0) {
                return Math.abs(p1) + Math.abs(p2);
            } else {
                return Math.abs(p1 - p2);
            }
        }

        public int intersectionArea(Rectangle otherRec) {
            int bottomSide;
            if (this.bottomLeft.getX() < otherRec.bottomLeft.getX()) {
                bottomSide = side(otherRec.bottomLeft.getX(), this.topRight.getX());
            } else {
                bottomSide = side(otherRec.topRight.getX(), this.bottomLeft.getX());
            }

            int leftSide;
            if (this.bottomLeft.getY() < otherRec.bottomLeft.getY()) {
                leftSide = side(this.topRight.getY(), otherRec.bottomLeft.getY());
            } else {
                leftSide = side(this.bottomLeft.getY(), otherRec.topRight.getY());
            }
            return bottomSide * leftSide;
        }

        public int totalArea(Rectangle otherRec) {
            int otherRecArea = otherRec.area();
            int currArea = area();
            if (otherRecArea == 0) {
                return currArea;
            }
            if (currArea == 0) {
                return otherRecArea;
            }
            return otherRecArea + currArea - intersectionArea(otherRec);
        }
    }

    class Point {
        private final int x;
        private final int y;

        Point(int x, int y) {
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

