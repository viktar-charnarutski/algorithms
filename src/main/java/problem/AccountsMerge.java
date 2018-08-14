package problem;

import java.util.*;

/**
 * 721. Accounts Merge
 * <p>
 * Given a list accounts, each element accounts[i] is a list of strings, where the first element accounts[i][0] is a
 * name, and the rest of the elements are emails representing emails of the account.
 * <p>
 * Now, we would like to mergeEmails these accounts. Two accounts definitely belong to the same person if there is some email
 * that is common to both accounts. Note that even if two accounts have the same name, they may belong to different
 * people as people could have the same name. A person can have any number of accounts initially, but all of their
 * accounts definitely have the same name.
 * <p>
 * After merging the accounts, return the accounts in the following format: the first element of each account is the
 * name, and the rest of the elements are emails in sorted order. The accounts themselves can be returned in any order.
 */
public class AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        if (accounts == null || accounts.size() < 2) {
            return accounts;
        }

        Map<String, List<Set<String>>> accountsMap = new HashMap<>();
        for (List<String> account : accounts) {
            String name = account.get(0);
            if (accountsMap.containsKey(name)) {
                addOrMerge(account, accountsMap);
            } else {
                saveAccount(account, accountsMap);
            }
        }

        return accountsAsList(accountsMap);
    }

    private void addOrMerge(List<String> account, Map<String, List<Set<String>>> accountsMap) {
        String name = account.get(0);
        List<Set<String>> accounts = accountsMap.get(name);
        for (Set<String> emails : accounts) {
            for (int i = 1; i < account.size(); i++) {
               if (emails.contains(account.get(i))) {
                   mergeEmails(account, emails);
                   return;
               }
            }
        }
        mapAccountToExistedName(account, accountsMap);
    }

    private void mapAccountToExistedName(List<String> account, Map<String, List<Set<String>>> accountsMap) {
        List<Set<String>> emails = accountsMap.get(account.get(0));
        Set<String> acc = new HashSet<>();
        for (int i = 1; i < account.size(); i++) {
            acc.add(account.get(i));
        }
        emails.add(acc);
    }

    private void mergeEmails(List<String> account, Set<String> emails) {
        for (int i = 1; i < account.size(); i++) {
            emails.add(account.get(i));
        }
    }

    private List<List<String>> accountsAsList(Map<String, List<Set<String>>> accountsMap) {
        List<List<String>> accountsList = new ArrayList<>();
        for (String name : accountsMap.keySet()) {
            List<Set<String>> accountEmails = accountsMap.get(name);
            for (Set<String> emails : accountEmails) {
                List<String> accountList = new ArrayList<>();
                accountList.add(name);
                accountList.addAll(emails);

                Collections.sort(accountList);
                accountsList.add(accountList);
            }
        }
        return accountsList;
    }

    private void saveAccount(List<String> account, Map<String, List<Set<String>>> accountsMap) {
        Set<String> emailsSet = new HashSet<>();
        for (int i = 1; i < account.size(); i++) {
            emailsSet.add(account.get(i));
        }
        List<Set<String>> accounts = new ArrayList<>();
        accounts.add(emailsSet);
        accountsMap.put(account.get(0), accounts);
    }
}
