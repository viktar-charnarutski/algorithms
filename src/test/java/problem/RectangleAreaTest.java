package problem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleAreaTest {

    @Test
    public void computeArea1() {
        assertEquals(45, new RectangleArea().computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }

    @Test
    public void computeArea2() {
        assertEquals(12, new RectangleArea().computeArea(2, 1, 4, 3, 3, 2, 6, 5));
    }

    @Test
    public void computeArea3() {
        assertEquals(4, new RectangleArea().computeArea(0, 0, 0, 0, -1, -1, 1, 1));
    }

    @Test
    public void bottomSide1() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(-3, 0), ins.new Point(3, 4));
        assertEquals(6, rect.bottomSide());
    }

    @Test
    public void bottomSide2() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(0, 0), ins.new Point(10, 4));
        assertEquals(10, rect.bottomSide());
    }

    @Test
    public void bottomSide3() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(2, 8), ins.new Point(10, 11));
        assertEquals(8, rect.bottomSide());
    }

    @Test
    public void leftSide1() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(-3, -2), ins.new Point(3, 4));
        assertEquals(6, rect.leftSide());
    }

    @Test
    public void leftSide2() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(0, 0), ins.new Point(10, 4));
        assertEquals(4, rect.leftSide());
    }

    @Test
    public void leftSide3() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(2, 8), ins.new Point(10, 11));
        assertEquals(3, rect.leftSide());
    }

    @Test
    public void area1() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(2, 8), ins.new Point(10, 11));
        assertEquals(24, rect.area());
    }

    @Test
    public void area2() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(2, 1), ins.new Point(4, 3));
        assertEquals(4, rect.area());
    }

    @Test
    public void area4() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(3, 2), ins.new Point(6, 5));
        assertEquals(9, rect.area());
    }

    @Test
    public void area5() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(0, 0), ins.new Point(0, 0));
        assertEquals(0, rect.area());
    }

    @Test
    public void area6() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect = ins.new Rectangle(ins.new Point(-1, -1), ins.new Point(1, 1));
        assertEquals(4, rect.area());
    }

    @Test
    public void intersectionArea1() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect1 = ins.new Rectangle(ins.new Point(-3, 0), ins.new Point(3, 4));
        RectangleArea.Rectangle rect2 = ins.new Rectangle(ins.new Point(0, -1), ins.new Point(9, 2));
        assertEquals(6, rect1.intersectionArea(rect2));
    }

    @Test
    public void intersectionArea2() {
        RectangleArea ins = new RectangleArea();
        RectangleArea.Rectangle rect1 = ins.new Rectangle(ins.new Point(2, 1), ins.new Point(4, 3));
        RectangleArea.Rectangle rect2 = ins.new Rectangle(ins.new Point(3, 2), ins.new Point(6, 5));
        assertEquals(1, rect1.intersectionArea(rect2));
    }

//    @Test
//    public void intersectionArea3() {
//        RectangleArea ins = new RectangleArea();
//        RectangleArea.Rectangle rect1 = ins.new Rectangle(ins.new Point(0, 0), ins.new Point(0, 0));
//        RectangleArea.Rectangle rect2 = ins.new Rectangle(ins.new Point(-1, -1), ins.new Point(1, 1));
//        assertEquals(0, rect1.intersectionArea(rect2));
//    }

}