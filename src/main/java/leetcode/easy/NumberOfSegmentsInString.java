package leetcode.easy;

/**
 * 434. Number of Segments in a String
 * <p>
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 * <p>
 * Please note that the string does not contain any non-printable characters.
 * <p>
 * Example:
 * <p>
 * Input: "Hello, my name is John"
 * Output: 5
 */
public class NumberOfSegmentsInString {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }

    public int countSegmentsSlow(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        return s.split("\\s+").length;

    }
}
