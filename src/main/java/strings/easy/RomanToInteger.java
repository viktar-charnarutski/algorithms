package strings.easy;

/**
 * 13. Roman to Integer
 * <p>
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case 'I': {
                    result++;
                    break;
                }
                case 'V': {
                    if (hasLeadingOne(s, i)) {
                        result += 3;
                    } else {
                        result += 5;
                    }
                    break;
                }
                case 'X': {
                    if (hasLeadingOne(s, i)) {
                        result += 8;
                    } else {
                        result += 10;
                    }
                    break;
                }
                case 'L': {
                    if (hasLeadingTen(s, i)) {
                        result += 30;
                    } else {
                        result += 50;
                    }
                    break;
                }
                case 'C': {
                    if (hasLeadingTen(s, i)) {
                        result += 80;
                    } else {
                        result += 100;
                    }
                    break;
                }
                case 'D': {
                    if (hasLeadingOneHundred(s, i)) {
                        result += 300;
                    } else {
                        result += 500;
                    }
                    break;
                }
                case 'M': {
                    if (hasLeadingOneHundred(s, i)) {
                        result += 800;
                    } else {
                        result += 1000;
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException(String.format("Illegal char %s", s.charAt(i)));
                }

            }

        }
        System.out.println(result);
        return result;
    }

    private static boolean hasLeadingOne(String s, int i) {
        return i != 0 && s.charAt(i - 1) == 'I';
    }

    private static boolean hasLeadingTen(String s, int i) {
        return i != 0 && s.charAt(i - 1) == 'X';
    }
    private static boolean hasLeadingOneHundred(String s, int i) {
        return i != 0 && s.charAt(i - 1) == 'C';
    }

}
