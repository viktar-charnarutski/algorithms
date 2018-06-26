package problem;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class FizzBuzzTest {

    @Test
    public void fizzBuzz() {
        FizzBuzz ins = new FizzBuzz();
        List<String> expected = Arrays.asList("1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz");
        assertEquals(expected, ins.fizzBuzz(15));
    }
}