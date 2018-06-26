package problem;

/**
 * URLify.
 * <p>
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 *
 *  Mr John SmitSmith
 * "Mr%20John%20Smith"
 */
public class URLify {
    public String urlify(String s) {
        if (s == null || s.isEmpty()) return s;
        char[] chars = s.toCharArray();
        int ind1 = chars.length - 1;
        int ind2 = chars.length - 1;

        while (!Character.isLetter(chars[ind1])) ind1--;

        while (ind1 >= 0) {
            if (chars[ind1] == ' ') {
                ind1--;
                chars[ind2--] = '0';
                chars[ind2--] = '2';
                chars[ind2--] = '%';
            } else {
                chars[ind2--] = chars[ind1--];
            }

        }
        return new String(chars);
    }
}
