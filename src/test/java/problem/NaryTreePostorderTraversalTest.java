package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class NaryTreePostorderTraversalTest {

    @Test
    public void postorder() {
        NaryTreePostorderTraversal.Node n6 = new NaryTreePostorderTraversal.Node(6, Collections.emptyList());
        NaryTreePostorderTraversal.Node n5 = new NaryTreePostorderTraversal.Node(5, Collections.emptyList());
        List<NaryTreePostorderTraversal.Node> n3Children = new ArrayList<>();
        n3Children.add(n5);
        n3Children.add(n6);
        NaryTreePostorderTraversal.Node n4 = new NaryTreePostorderTraversal.Node(4, Collections.emptyList());
        NaryTreePostorderTraversal.Node n3 = new NaryTreePostorderTraversal.Node(3, n3Children);
        NaryTreePostorderTraversal.Node n2 = new NaryTreePostorderTraversal.Node(2, Collections.emptyList());
        List<NaryTreePostorderTraversal.Node> n1Children = new ArrayList<>();
        n1Children.add(n2);
        n1Children.add(n3);
        n1Children.add(n4);
        NaryTreePostorderTraversal.Node n1 = new NaryTreePostorderTraversal.Node(1, n1Children);

        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6);
        expected.add(3);
        expected.add(2);
        expected.add(4);
        expected.add(1);

        assertEquals(expected, new NaryTreePostorderTraversal().postorder(n1));
    }
}