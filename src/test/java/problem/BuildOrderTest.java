package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BuildOrderTest {

    @Test
    public void buildOrder() {
        char[] projects = {'a', 'b', 'c', 'd', 'e', 'f'};
        char[][] dependencies = new char[5][2];
        dependencies[0][0] = 'a';
        dependencies[0][1] = 'd';
        dependencies[1][0] = 'f';
        dependencies[1][1] = 'b';
        dependencies[2][0] = 'b';
        dependencies[2][1] = 'd';
        dependencies[3][0] = 'f';
        dependencies[3][1] = 'a';
        dependencies[4][0] = 'd';
        dependencies[4][1] = 'c';

        char[] order = {'f', 'e', 'a', 'b', 'd', 'c'};

        assertArrayEquals(order, new BuildOrder().buildOrder(projects, dependencies));

    }
}