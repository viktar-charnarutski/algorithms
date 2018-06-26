package problem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DailyTemperaturesTest {

    @Test
    public void dailyTemperatures() {
        DailyTemperatures ins = new DailyTemperatures();
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, ins.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    public void dailyTemperatures_no_increase() {
        DailyTemperatures ins = new DailyTemperatures();
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, ins.dailyTemperatures(new int[]{73, 73, 73, 73, 73, 73, 73, 73}));
    }

    @Test
    public void dailyTemperatures_decrease() {
        DailyTemperatures ins = new DailyTemperatures();
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, ins.dailyTemperatures(new int[]{79, 78, 77, 76, 75, 74, 73, 72}));
    }

    @Test
    public void dailyTemperatures_increase_by_one() {
        DailyTemperatures ins = new DailyTemperatures();
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 0}, ins.dailyTemperatures(new int[]{73, 74, 75, 76, 77, 78, 79, 80}));
    }

    @Test
    public void dailyTemperatures_one_day() {
        DailyTemperatures ins = new DailyTemperatures();
        assertArrayEquals(new int[]{0}, ins.dailyTemperatures(new int[]{80}));
    }

    @Test
    public void dailyTemperatures_increase_two_days() {
        DailyTemperatures ins = new DailyTemperatures();
        assertArrayEquals(new int[]{1, 0}, ins.dailyTemperatures(new int[]{79, 80}));
    }
}