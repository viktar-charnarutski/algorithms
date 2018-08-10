package problem;

/**
 * 709. To Lower Case
 * <p>
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        if (str == null || str.trim().length() == 0) {
            return "";
        }
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
                strArr[i] = (char) (strArr[i] - 'A' + 'a');
            }
        }
        return new String(strArr);
    }

    public String toLowerCaseLib(String str) {
        if (str == null || str.trim().length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
