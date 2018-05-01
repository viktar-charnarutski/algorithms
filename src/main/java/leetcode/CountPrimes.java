package leetcode;

/**
 * 204. Count Primes
 *
 * Count the number of prime numbers less than a non-negative number, n.
 *
 */
public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] nonPrimes = new boolean[n];
        for (int i = 2; i < n; i++) {

            if(!nonPrimes[i]) {
                for (int j = 2; i * j < n; j++) {
                    nonPrimes[i * j] = true;
                }
                count++;
            }
        }
        return count;
    }
}
