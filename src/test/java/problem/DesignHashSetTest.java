package problem;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DesignHashSetTest {

    @Test
    public void hashSet() {
        DesignHashSet set = new DesignHashSet();
        set.add(1);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));

        set.add(2);
        assertTrue(set.contains(2));

        set.remove(2);
        assertFalse(set.contains(2));

        assertTrue(set.contains(1));
        set.remove(1);
        assertFalse(set.contains(1));

    }
}