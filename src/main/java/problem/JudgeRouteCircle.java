package problem;

/**
 * 657. Judge Route Circle
 * <p>
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
 * <p>
 * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
 * <p>
 * Example 1:
 * Input: "UD"
 * Output: true
 * Example 2:Л
 * Input: "LL"Л
 * Output: false
 */
public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        if (moves == null || moves.isEmpty()) return false;

        moves = moves.trim().toLowerCase();

        int[] movesCount = new int[128];

        for (char c : moves.toCharArray()) {
            movesCount[c]++;
        }

        return movesCount['u'] == movesCount['d'] && movesCount['l'] == movesCount['r'];
    }

    public boolean judgeCircleSwitch(String moves) {
        if (moves == null || moves.isEmpty()) return false;

        moves = moves.trim().toLowerCase();

        int horizontal = 0, vertical = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'd': {
                    vertical--;
                    break;
                }
                case 'u': {
                    vertical++;
                    break;
                }
                case 'l': {
                    horizontal--;
                    break;
                }
                case 'r': {
                    horizontal++;
                    break;
                }
                default:
                    throw new IllegalArgumentException(String.format("Character \'%s\' is not allowed", c));
            }
        }
        return horizontal == 0 && vertical == 0;
    }
}
