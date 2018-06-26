package problem;

/**
 * 553. Optimal Division
 *
 * Given a list of positive integers, the adjacent integers will perform the float division.
 * For example, [2,3,4] -> 2 / 3 / 4.
 *
 * However, you can add any number of parenthesis at any position to change the priority of operations.
 * You should find out how to add parenthesis to get the maximum result,
 * and return the corresponding expression in string format.
 *
 * Your expression should NOT contain redundant parenthesis.
 */
public class OptimalDivision {
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) return nums[0] + "";
        if (nums.length == 2) return nums[0] + "/" + nums[1];

        StringBuilder sb = new StringBuilder(nums[0] + "/(" + nums[1]);
        for (int i = 2; i < nums.length; i++) {
            sb.append("/").append(nums[i]);
        }
        return sb.append(")").toString();
    }
}
