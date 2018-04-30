package leetcode.easy;

/**
 * 204. Count Primes
 *
 * Count the number of prime numbers less than a non-negative number, n.
 *
 */
public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrime(i)) count++;
        }
        return count;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
