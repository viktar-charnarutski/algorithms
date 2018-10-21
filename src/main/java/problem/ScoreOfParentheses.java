package problem;

/**
 * 856. Score of Parentheses
 * <p>
 * Given a balanced parentheses string S, compute the score of the string based on the following rule:
 * <p>
 * () has score 1
 * AB has score A + B, where A and B are balanced parentheses strings.
 * (A) has score 2 * A, where A is a balanced parentheses string.
 */
public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        int balance = 0, answer = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
                if (S.charAt(i - 1) == '(') {
                    answer += 1 << balance;
                }
            }
        }
        return answer;
    }
}
