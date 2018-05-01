package leetcode;

/**
 * 171. Excel Sheet Column Number
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int res = 0;
        int mult = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            res += mult * (s.charAt(i) - 'A' + 1);
            mult *= 26;
        }
        return res;
    }
}
