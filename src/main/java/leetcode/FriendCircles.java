package leetcode;

/**
 * 547. Friend Circles
 * <p>
 * There are N students in a class. Some of them are friends, while some are not.
 * Their friendship is transitive in nature. For example, if A is a direct friend of B,
 * and B is a direct friend of C, then A is an indirect friend of C. And we defined
 * a friend circle is a group of students who are direct or indirect friends.
 * <p>
 * Given a N*N matrix M representing the friend relationship between students in the class.
 * If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not.
 * And you have to output the total number of friend circles among all the students.
 * [1,0,0,1]
 * [0,1,1,0]
 * [0,1,1,1]
 * [1,0,1,1]
 */
public class FriendCircles {
    public int findCircleNum(int[][] M) {
        int res = 0;
        for (int i = 0; i < M.length; i++) {
            if (M[i][i] == 1) {
                res++;
                check(M, i);
            }

        }
        return res;
    }

    private void check(int[][] M, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1) {
                M[i][j] = 0;
                M[j][i] = 0;
                check(M, j);
            }
        }
    }
}