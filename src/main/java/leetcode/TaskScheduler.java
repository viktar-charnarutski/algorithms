package leetcode;

import java.util.Arrays;

/**
 * 621. Task Scheduler
 * <p>
 * Given a char array representing tasks CPU need to do.
 * It contains capital letters A to Z where different letters represent different tasks.
 * Tasks could be done without original order. Each task could be done in one interval.
 * For each interval, CPU could finish one task or just be idle.
 * <p>
 * However, there is a non-negative cooling interval n that means between two same tasks,
 * there must be at least n intervals that CPU are doing different tasks or just be idle.
 * <p>
 * You need to return the least number of intervals the CPU will take to finish all the given tasks.
 * "A","A","A","B","B","B"
 */
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int cycles = 0;
        int[] tasksCount = new int[26];
        for (char c : tasks) {
            tasksCount[c - 'A']++;
        }

        Arrays.sort(tasksCount);

        while (tasksCount[25] > 0) {
            int i = 0;

            while (i <= n) {
                if (tasksCount[25] == 0) {
                    break;
                }
                if (i <= 25 && tasksCount[25 - i] > 0) {
                    tasksCount[25 - i]--;
                }
                i++;
                cycles++;
            }
            Arrays.sort(tasksCount);
        }

        return cycles;
    }
}
