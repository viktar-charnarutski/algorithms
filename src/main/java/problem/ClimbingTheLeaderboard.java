package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Climbing the Leaderboard
 * <p>
 * Alice is playing an arcade game and wants to climb to the top of the leaderboard and wants to track her ranking.
 * The game uses Dense Ranking, so its leaderboard works like this:
 * <p>
 * The player with the highest score is ranked number 1 on the leaderboard.
 * Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately
 * following ranking number.
 */
public class ClimbingTheLeaderboard {
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        List<Integer> ranks = new ArrayList<>();
        ranks.add(scores[0]);
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == ranks.get(ranks.size() - 1)) {
                continue;
            }
            ranks.add(scores[i]);
        }

        int[] res = new int[alice.length];
        for (int i = 0; i < alice.length; i++) {
            int aRank = 1;
            for (int rank : ranks) {
                if (alice[i] >= rank) {
                    res[i] = aRank;
                    break;
                }
                aRank++;
            }
            if (res[i] == 0) {
                res[i] = aRank;
            }
        }
        return res;
    }
}
