package leetcode;

/**
 * 838. Push Dominoes
 * <p>
 * There are N dominoes in a line, and we place each domino vertically upright.
 * <p>
 * In the beginning, we simultaneously push some of the dominoes either to the left or to the right.
 * <p>
 * After each second, each domino that is falling to the left pushes the adjacent domino on the left.
 * <p>
 * Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.
 * <p>
 * When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.
 * <p>
 * For the purposes of this question, we will consider that a falling domino expends no additional force to a falling
 * or already fallen domino.
 * <p>
 * Given a string "S" representing the initial state. S[i] = 'L', if the i-th domino has been pushed to the left;
 * S[i] = 'R', if the i-th domino has been pushed to the right; S[i] = '.', if the i-th domino has not been pushed.
 * <p>
 * Return a string representing the final state.
 * <p>
 * Example 1:
 * <p>
 * Input: ".L.R...LR..L.."
 * Output: "LL.RR.LLRRLL.."
 */
public class PushDominoes {
    public String pushDominoes(String dominoes) {

        int l = dominoes.length();
        int[] forces = new int[l];

        int force = 0;
        for (int i = 0; i < l; i++) {
            if (dominoes.charAt(i) == 'R') force = l;
            else if (dominoes.charAt(i) == 'L') force = 0;
            else force = Math.max(force - 1, 0);
            forces[i] = force;
        }

        force = 0;
        for (int i = l - 1; i >= 0; --i) {
            if (dominoes.charAt(i) == 'L') force = l;
            else if (dominoes.charAt(i) == 'R') force = 0;
            else force = Math.max(force - 1, 0);
            forces[i] -= force;
        }

        StringBuilder sb = new StringBuilder();
        for (int f : forces) {
            sb.append(f > 0 ? 'R' : f < 0 ? 'L' : '.');
        }

        return sb.toString();
    }
}
