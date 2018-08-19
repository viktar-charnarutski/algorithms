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
}
