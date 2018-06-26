package problem;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 */
public class ExcelSheetColumnNumberTest {

    @Test
    public void titleToNumber() {

        ExcelSheetColumnNumber ins = new ExcelSheetColumnNumber();

        assertTrue(28 == ins.titleToNumber("AB"));
        assertTrue(703 == ins.titleToNumber("AAA"));
    }
}