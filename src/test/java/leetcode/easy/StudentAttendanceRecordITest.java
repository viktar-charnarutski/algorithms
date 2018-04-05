package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class StudentAttendanceRecordITest {

    @Test
    public void checkRecord() {
        StudentAttendanceRecordI ins = new StudentAttendanceRecordI();
        assertTrue(ins.checkRecord("PPALLP"));
        assertFalse(ins.checkRecord("PPALLL"));
        assertFalse(ins.checkRecord("PPPPPPPPPPAA"));
        assertTrue(ins.checkRecord("PPPPPPPPPPA"));
        assertFalse(ins.checkRecord("PPPPPPPPPPLLL"));
        assertFalse(ins.checkRecord("LLL"));
    }
}