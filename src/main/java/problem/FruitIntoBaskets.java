package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 904. Fruit Into Baskets
 * <p>
 * In a row of trees, the i-th tree produces fruit with type tree[i].
 * <p>
 * You start at any tree of your choice, then repeatedly perform the following steps:
 * <p>
 * Add one piece of fruit from this tree to your baskets.  If you cannot, stop.
 * Move to the next tree to the right of the current tree.  If there is no tree to the right, stop.
 * Note that you do not have any choice after the initial choice of starting tree: you must perform step 1, then step 2,
 * then back to step 1, then step 2, and so on until you stop.
 * <p>
 * You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one
 * type of fruit each.
 * <p>
 * What is the total amount of fruit you can collect with this procedure?
 */
public class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        Map<Integer, Integer> count = new HashMap<>();
        int total = 0;
        for (int start = 0, end = 0; end < tree.length; end++) {
            count.put(tree[end], count.getOrDefault(tree[end], 0) + 1);
            while (count.size() > 2) {
                count.put(tree[start], count.get(tree[start]) - 1);
                if (count.get(tree[start]) == 0) {
                    count.remove(tree[start]);
                }
                start++;
            }
            total = Math.max(end - start + 1, total);
        }
        return total;
    }
}
