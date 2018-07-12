package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RandomNodeTest {

    @Test
    public void find_existed() {
        RandomNode<Integer> n1 = new RandomNode<>(1);
        RandomNode<Integer> n2 = new RandomNode<>(2);
        RandomNode<Integer> n3 = new RandomNode<>(3);
        RandomNode<Integer> n4 = new RandomNode<>(4);
        RandomNode<Integer> n5 = new RandomNode<>(5);
        RandomNode<Integer> n6 = new RandomNode<>(6);
        RandomNode<Integer> n7 = new RandomNode<>(7);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);

        assertTrue(n1.find(5));
    }

    @Test
    public void find_non_existed() {
        RandomNode<Integer> n1 = new RandomNode<>(1);
        RandomNode<Integer> n2 = new RandomNode<>(2);
        RandomNode<Integer> n3 = new RandomNode<>(3);
        RandomNode<Integer> n4 = new RandomNode<>(4);
        RandomNode<Integer> n5 = new RandomNode<>(5);
        RandomNode<Integer> n6 = new RandomNode<>(6);
        RandomNode<Integer> n7 = new RandomNode<>(7);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);

        assertFalse(n1.find(7));
    }

    @Test
    public void getRandom() {
        RandomNode<Integer> n1 = new RandomNode<>(1);
        RandomNode<Integer> n2 = new RandomNode<>(2);
        RandomNode<Integer> n3 = new RandomNode<>(3);
        RandomNode<Integer> n4 = new RandomNode<>(4);
        RandomNode<Integer> n5 = new RandomNode<>(5);
        RandomNode<Integer> n6 = new RandomNode<>(6);
        RandomNode<Integer> n7 = new RandomNode<>(7);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);

        RandomNode<Integer> r1 = n1.getRandomNode();
        RandomNode<Integer> r2 = n1.getRandomNode();
        assertNotEquals(r1, r2);
    }

    @Test
    public void getAllNodesAsList() {
        RandomNode<Integer> n1 = new RandomNode<>(1);
        RandomNode<Integer> n2 = new RandomNode<>(2);
        RandomNode<Integer> n3 = new RandomNode<>(3);
        RandomNode<Integer> n4 = new RandomNode<>(4);
        RandomNode<Integer> n5 = new RandomNode<>(5);
        RandomNode<Integer> n6 = new RandomNode<>(6);
        RandomNode<Integer> n7 = new RandomNode<>(7);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);

        ArrayList<RandomNode<Integer>> expected = new ArrayList<>();
        expected.add(n1);
        expected.add(n2);
        expected.add(n3);
        expected.add(n4);
        expected.add(n5);
        expected.add(n6);
        expected.add(n7);

        assertEquals(expected, n1.getAllNodesAsList());
    }
    @Test
    public void deleteNode() {
        RandomNode<Integer> n1 = new RandomNode<>(1);
        RandomNode<Integer> n2 = new RandomNode<>(2);
        RandomNode<Integer> n3 = new RandomNode<>(3);
        RandomNode<Integer> n4 = new RandomNode<>(4);
        RandomNode<Integer> n5 = new RandomNode<>(5);
        RandomNode<Integer> n6 = new RandomNode<>(6);
        RandomNode<Integer> n7 = new RandomNode<>(7);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);

        RandomNode<Integer> e1 = new RandomNode<>(1);
        RandomNode<Integer> e2 = new RandomNode<>(2);
        RandomNode<Integer> e3 = new RandomNode<>(3);
        RandomNode<Integer> e4 = new RandomNode<>(4);
        RandomNode<Integer> e5 = new RandomNode<>(5);
        RandomNode<Integer> e6 = new RandomNode<>(6);
        RandomNode<Integer> e7 = new RandomNode<>(7);

        e1.setLeft(e2);

        e2.setLeft(e4);
        e2.setRight(e5);

        n1.delete(n3);

        assertEquals(e1, n1);
    }
}