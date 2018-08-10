package problem;

/**
 * 705. Design HashSet
 * <p>
 * Design a HashSet without using any built-in hash table libraries.
 * <p>
 * To be specific, your design should include these functions:
 * <p>
 * add(value): Insert a value into the HashSet.
 * contains(value) : Return whether the value exists in the HashSet or not.
 * remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.
 */
public class DesignHashSet {

    private Integer[] arr;

    /**
     * Initialize your data structure here.
     */
    public DesignHashSet() {
         arr = new Integer[1000000];
    }

    public void add(int key) {
        arr[key] = key;
    }

    public void remove(int key) {
        arr[key] = null;
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return arr[key] != null;
    }
}
