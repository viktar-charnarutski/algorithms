package problem;

/**
 * 415. Add Strings
 * <p>
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * <p>
 * Note:
 * <p>
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int remained = 0;

        int n1Length = num1.length() - 1;
        int n2Length = num2.length() - 1;

        while (n1Length >= 0 || n2Length >= 0) {
                int iNum1 = n1Length >= 0 ? num1.charAt(n1Length--) - '0' : 0;
                int iNum2 = n2Length >= 0 ? num2.charAt(n2Length--) - '0' : 0;

                int currRes = iNum1 + iNum2 + remained;

                res.append(currRes % 10);
                remained = currRes > 9 ? 1 : 0;
            }

        if (remained > 0) {
            res.append(1);
        }
        return res.reverse().toString();
    }
}
