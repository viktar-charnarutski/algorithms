package leetcode;

/**
 * Zero Matrix
 * <p>
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column are set to 0.
 */
public class ZeroMatrix {
    public void setZeroes(int[][] m) {
        int[][] n = copyMatrix(m);

        for (int c = 0; c < m.length; c++) {
            for (int r = 0; r < m[0].length; r++) {
                if (n[c][r] == 0) mark(m, c, r);
            }
        }
    }

    private int[][] copyMatrix(int[][] m) {
        int[][] n = new int[m.length][m[0].length];
        for (int c = 0; c < m.length; c++) {
            System.arraycopy(m[c], 0, n[c], 0, m[0].length);
        }
        return n;
    }

    private void mark(int[][] m, int c, int r) {
        for (int i = 0; i < m.length; i++) {
            m[i][r] = 0;
        }
        for (int i = 0; i < m[0].length; i++) {
            m[c][i] = 0;
        }
    }
}
