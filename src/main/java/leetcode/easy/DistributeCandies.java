package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 575. Distribute Candies
 * <p>
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies.
 * Each number means one candy of the corresponding kind. You need to distribute these candies equally in number
 * to brother and sister. Return the maximum number of kinds of candies the sister could gain.
 * <p>
 * The length of the given array is in range [2, 10,000], and will be even.
 * The number in given array is in range [-100,000, 100,000].
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        boolean[] candyTypes = new boolean[200_001];
        int candyTypesCount = 0;

        for (int candy : candies) {
            candy += 100_000;
            if (!candyTypes[candy]) {
                candyTypes[candy] = true;
                candyTypesCount++;
            }
        }
        return candyTypesCount >= candies.length / 2 ? candies.length / 2 : candyTypesCount;
    }

    public int distributeCandiesHashSet(int[] candies) {
        Set<Integer> candyTypes = new HashSet<>();
        for (int candy : candies) {
            candyTypes.add(candy);
        }
        return candyTypes.size() >= candies.length / 2 ? candies.length / 2 : candyTypes.size();
    }
}
