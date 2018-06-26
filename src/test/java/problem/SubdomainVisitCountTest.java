package problem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class SubdomainVisitCountTest {

    SubdomainVisitCount ins = new SubdomainVisitCount();

    @Test
    public void subdomainVisits() {
        ArrayList<String> expected1 = new ArrayList<>();
        expected1.add("9001 com");
        expected1.add("9001 leetcode.com");
        expected1.add("9001 discuss.leetcode.com");
        assertEquals(expected1, ins.subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));

        ArrayList<String> expected2 = new ArrayList<>();
        expected2.add("951 com");
        expected2.add("900 google.mail.com");
        expected2.add("1 intel.mail.com");
        expected2.add("5 org");
        expected2.add("5 wiki.org");
        expected2.add("901 mail.com");
        expected2.add("50 yahoo.com");
        assertEquals(expected2, ins.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));

    }
}