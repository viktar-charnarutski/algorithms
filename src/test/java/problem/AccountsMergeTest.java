package problem;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AccountsMergeTest {

    @Test
    public void accountsMerge1() {
        List<List<String>> accounts = new ArrayList<>();
        List<String> account1 = new ArrayList<>();
        account1.add("John");
        account1.add("johnsmith@mail.com");
        account1.add("john00@mail.com");
        accounts.add(account1);
        List<String> account2 = new ArrayList<>();
        account2.add("John");
        account2.add("johnnybravo@mail.com");
        accounts.add(account2);
        List<String> account3 = new ArrayList<>();
        account3.add("John");
        account3.add("johnsmith@mail.com");
        account3.add("john_newyork@mail.com");
        accounts.add(account3);
        List<String> account4 = new ArrayList<>();
        account4.add("Mary");
        account4.add("mary@mail.com");
        accounts.add(account4);

        List<List<String>> expected = new ArrayList<>();
        List<String> expected1 = new ArrayList<>();
        expected1.add("John");
        expected1.add("johnsmith@mail.com");
        expected1.add("john00@mail.com");
        expected1.add("john_newyork@mail.com");
        expected.add(expected1);
        List<String> expected2 = new ArrayList<>();
        expected2.add("John");
        expected2.add("johnnybravo@mail.com");
        expected.add(expected2);
        List<String> expected3 = new ArrayList<>();
        expected3.add("Mary");
        expected3.add("mary@mail.com");
        expected.add(expected3);

        assertEquals(expected, new AccountsMerge().accountsMerge(accounts));
    }

    @Test
    public void accountsMerge2() {
        List<List<String>> accounts = new ArrayList<>();
        List<String> account1 = new ArrayList<>();
        account1.add("John");
        account1.add("johnsmith@mail.com");
        account1.add("john_newyork@mail.com");
        accounts.add(account1);
        List<String> account2 = new ArrayList<>();
        account2.add("John");
        account2.add("johnnybravo@mail.com");
        accounts.add(account2);
        List<String> account3 = new ArrayList<>();
        account3.add("John");
        account3.add("johnsmith@mail.com");
        account3.add("john00@mail.com");
        accounts.add(account3);
        List<String> account4 = new ArrayList<>();
        account4.add("Mary");
        account4.add("mary@mail.com");
        accounts.add(account4);

        List<List<String>> expected = new ArrayList<>();
        List<String> expected1 = new ArrayList<>();
        expected1.add("John");
        expected1.add("john00@mail.com");
        expected1.add("john_newyork@mail.com");
        expected1.add("johnsmith@mail.com");
        expected.add(expected1);
        List<String> expected2 = new ArrayList<>();
        expected2.add("John");
        expected2.add("johnnybravo@mail.com");
        expected.add(expected2);
        List<String> expected3 = new ArrayList<>();
        expected3.add("Mary");
        expected3.add("mary@mail.com");
        expected.add(expected3);

        assertEquals(expected, new AccountsMerge().accountsMerge(accounts));
    }

    @Test
    public void accountsMerge3() {
        List<List<String>> accounts = new ArrayList<>();
        List<String> account1 = new ArrayList<>();
        account1.add("David");
        account1.add("David0@m.co");
        account1.add("David1@m.co");
        accounts.add(account1);
        List<String> account2 = new ArrayList<>();
        account2.add("David");
        account2.add("David3@m.co");
        account2.add("David4@m.co");
        accounts.add(account2);
        List<String> account3 = new ArrayList<>();
        account3.add("David");
        account3.add("David4@m.co");
        account3.add("David5@m.co");
        accounts.add(account3);
        List<String> account4 = new ArrayList<>();
        account4.add("David");
        account4.add("David2@m.co");
        account4.add("David3@m.co");
        accounts.add(account4);
        List<String> account5 = new ArrayList<>();
        account5.add("David");
        account5.add("David1@m.co");
        account5.add("David2@m.co");
        accounts.add(account5);

        List<List<String>> expected = new ArrayList<>();
        List<String> expected1 = new ArrayList<>();
        expected1.add("David");
        expected1.add("David0@m.co");
        expected1.add("David1@m.co");
        expected1.add("David2@m.co");
        expected1.add("David3@m.co");
        expected1.add("David4@m.co");
        expected1.add("David5@m.co");
        expected.add(expected1);

        assertEquals(expected, new AccountsMerge().accountsMerge(accounts));
    }
}