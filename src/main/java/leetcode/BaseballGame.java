package leetcode;

import java.util.LinkedList;

/**
 * 682. Baseball Game
 * <p>
 * You're now a baseball game point recorder.
 * <p>
 * Given a list of strings, each string can be one of the 4 following types:
 * <p>
 * Integer (one round's score): Directly represents the number of points you get in this round.
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 * <p>
 * You need to return the sum of the points you could get in all the rounds.
 */
public class BaseballGame {
    public int calPoints(String[] ops) {
        int score = 0;

        final LinkedList<Integer> stat = new LinkedList<>();

        for (String op : ops) {
            int currScore;
            switch (op) {
                case "C":
                    score -= stat.removeLast();
                    break;
                case "+":
                    currScore = stat.peekLast() + stat.get(stat.size() - 2);
                    stat.add(currScore);
                    score += currScore;
                    break;
                case "D":
                    currScore = stat.peekLast() * 2;
                    stat.add(currScore);
                    score += currScore;
                    break;
                default:
                    currScore = Integer.valueOf(op);
                    stat.add(currScore);
                    score += currScore;
                    break;
            }
        }
        return score;
    }
}
