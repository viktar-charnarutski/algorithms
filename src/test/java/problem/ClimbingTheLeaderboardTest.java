package problem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingTheLeaderboardTest {

    @Test
    public void climbingLeaderboard1() {
        assertArrayEquals(new int[]{6, 4, 2, 1},
                ClimbingTheLeaderboard.climbingLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120}));
    }
    @Test
    public void climbingLeaderboard2() {
        assertArrayEquals(new int[]{1},
                ClimbingTheLeaderboard.climbingLeaderboard(new int[0], new int[]{5, 25, 50, 120}));
    }
}