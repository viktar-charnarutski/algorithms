package leetcode;

/**
 * 551. Student Attendance Record I
 * <p>
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 * <p>
 * You need to return whether the student could be rewarded according to his attendance record.
 * <p>
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateCount = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A': {
                    if (absentCount == 1) {
                        return false;
                    }
                    absentCount++;
                    lateCount = 0;
                    break;
                }
                case 'L': {
                    if (lateCount == 2) {
                        return false;
                    }
                    lateCount++;
                    break;
                }
                default: {
                    lateCount = 0;
                }
            }
        }
        return true;
    }
}
