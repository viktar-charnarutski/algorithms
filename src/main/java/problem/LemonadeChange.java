package problem;

import java.util.HashMap;

/**
 * 860. Lemonade Change
 * <p>
 * At a lemonade stand, each lemonade costs $5.
 * <p>
 * Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
 * <p>
 * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.
 * You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
 * <p>
 * Note that you don't have any change in hand at first.
 * <p>
 * Return true if and only if you can provide every customer with correct change.
 */
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer /*bill*/, Integer /*amount*/> change = new HashMap<>();
        for (int bill : bills) {
            switch (bill) {
                case 5: {
                    keepChangeFor(5, change.getOrDefault(5, 0) + 1, change);
                    break;
                }
                case 10: {
                    int bill5Amount = change.getOrDefault(5, 0);
                    if (bill5Amount > 0) {
                        keepChangeFor(5, --bill5Amount, change);
                        keepChangeFor(10, change.getOrDefault(10, 0) + 1, change);
                    } else {
                        return false;
                    }
                    break;
                }
                case 20: {
                    int bill10Amount = change.getOrDefault(10, 0);
                    int bill5Amount = change.getOrDefault(5, 0);
                    // checking 1x10 + 1x5
                    if (bill10Amount > 0) {
                        // checking 3x5
                        if (bill5Amount > 0) {
                            keepChangeFor(5, --bill5Amount, change);
                            keepChangeFor(10, --bill10Amount, change);
                        } else {
                            return false;
                        }
                    } else {
                        if (bill5Amount >= 3) {
                            keepChangeFor(5, bill5Amount - 3, change);
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private void keepChangeFor(int bill, int amount, HashMap<Integer, Integer> change) {
        change.put(bill, amount);
    }
}
