package problem;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Cake Thief
 * <p>
 * You are a renowned thief who has recently switched from stealing precious metals to stealing cakes because of the
 * insane profit margins. You end up hitting the jackpot, breaking into the world's largest privately owned stock of
 * cakes—the vault of the Queen of England.
 * <p>
 * While Queen Elizabeth has a limited number of types of cake, she has an unlimited supply of each type.
 * <p>
 * Each type of cake has a weight and a value, stored in a tuple with two indices:
 * <p>
 * An integer representing the weight of the cake in kilograms
 * An integer representing the monetary value of the cake in British shillings.
 * <p>
 * You brought a duffel bag that can hold limited weight, and you want to make off with the most valuable haul possible.
 * <p>
 * Write a function max_duffel_bag_value() that takes a list of cake type tuples and a weight capacity, and returns the
 * maximum monetary value the duffel bag can hold.
 * <p>
 * Weights and values may be any non-negative integer. Yes, it's weird to think about cakes that weigh nothing or duffel
 * bags that can't hold anything. But we're not just super mastermind criminals—we're also meticulous about keeping our
 * algorithms flexible and comprehensive.
 */
public class CakeThief {
    public static class CakeType {

        final int weight;
        final int value;

        public CakeType(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        @Override
        public String toString() {
            return "CakeType{" +
                    "weight=" + weight +
                    ", value=" + value +
                    '}';
        }
    }

    public static class InfiniteWeightException extends RuntimeException {
        public InfiniteWeightException(String message) {
            super(message);
        }
    }

    public static long maxDuffelBagValue(CakeType[] cakeTypes, int weightCapacity) {
        long[] res = new long[weightCapacity + 1];

        for (int currCapacity = 0; currCapacity <= weightCapacity; currCapacity++) {
            long currMax = 0;
            for (CakeType cake : cakeTypes) {
                if (cake.weight <= currCapacity) {
                    long currVal = cake.value + res[currCapacity - cake.weight];
                    currMax = Math.max(currVal, currMax);
                }
            }
            res[currCapacity] = currMax;
        }
        return res[weightCapacity];
    }
}
