package problem;

/**
 * 566. Reshape the Matrix
 * <p>
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different
 * size but keep its original data.
 * <p>
 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row
 * number and column number of the wanted reshaped matrix, respectively.
 * <p>
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order
 * as they were.
 * <p>
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise,
 * output the original matrix.
 */
public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int length = nums.length;
        int wide = nums[0].length;
        if (length * wide != r * c) return nums;

        int[][] reshaped = new int[r][c];

        for (int i = 0; i < r * c; i++) {
            reshaped[i / c][i % c] = nums[i / wide] [i % wide];
        }
        return reshaped;
    }

    public int[][] matrixReshape2(int[][] nums, int r, int c) {

        if (nums.length * nums[0].length != r * c) return nums;

        int[][] reshaped = new int[r][c];
        int rIndex = 0;
        int cIndex = 0;

        for (int[] num : nums) {
            for (int aNum : num) {
                reshaped[rIndex][cIndex] = aNum;
                cIndex++;
                if (cIndex == c) {
                    cIndex = 0;
                    rIndex++;
                }
            }
        }
        return reshaped;
    }
}
