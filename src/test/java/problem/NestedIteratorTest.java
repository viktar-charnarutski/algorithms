package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertSame;

public class NestedIteratorTest {

    @Test
    public void iterator1() {
        NestedInteger nint1 = new NestedIntegerOrList(1);
        NestedInteger nint2 = new NestedIntegerOrList(2);
        NestedInteger nint3 = new NestedIntegerOrList(3);

        List<NestedInteger> list = new ArrayList<>();
        list.add(nint1);
        list.add(nint2);
        list.add(nint3);

        NestedInteger nintList = new NestedIntegerOrList(list);

        List<NestedInteger> input = new ArrayList<>();
        input.add(nint1);
        input.add(nint2);
        input.add(nintList);
        input.add(nint3);

        NestedIterator ins = new NestedIterator(input);
        assertSame(1, ins.next());
        assertSame(2, ins.next());
        assertSame(1, ins.next());
        assertSame(2, ins.next());
        assertSame(3, ins.next());
        assertSame(3, ins.next());
    }
}