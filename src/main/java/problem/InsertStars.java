package problem;

/**
 * Insert Stars
 * <p>
 * Given a string, recursively compute a new string where the identical adjacent characters in the original string are
 * separated by a "*".
 */
public class InsertStars {
    public String insertPairStar(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        return s.charAt(0) == s.charAt(1) ? s.charAt(0) + "*" + insertPairStar(s.substring(1, s.length())) :
                s.charAt(0) + insertPairStar(s.substring(1, s.length()));
    }

    public String insertPairStarIterative(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                sb.append("*");
            }
        }
        return sb.toString();
    }
}
