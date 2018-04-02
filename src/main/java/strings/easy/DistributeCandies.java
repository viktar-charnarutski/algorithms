package strings.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 575. Distribute Candies
 * <p>
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies.
 * Each number means one candy of the corresponding kind. You need to distribute these candies equally in number
 * to brother and sister. Return the maximum number of kinds of candies the sister could gain.
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> candyTypes = new HashSet<>();
        for (int candy : candies) {
            candyTypes.add(candy);
        }
        return candyTypes.size() < candies.length / 2 ? candyTypes.size() : candies.length / 2;
    }
}
