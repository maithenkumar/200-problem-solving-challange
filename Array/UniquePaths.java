// https://leetcode.com/problems/unique-paths/description/
public class UniquePaths {

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths3(int m, int n) {
        if (m == 0 || n == 0) {
            throw new IllegalArgumentException("m or n can't be 0");
        }
        return numPaths(m - 1, n - 1);
    }

    private static int numPaths(int i, int j) {
        if (i == 0 || j == 0) { // includes the row 0 and col 0
            return 1;
        }
        return numPaths(i - 1, j) + numPaths(i, j - 1);
    }

    public static int uniquePaths2(int m, int n) {
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
            }
        }
        return grid[m - 1][n - 1];
    }

    public static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            throw new IllegalArgumentException("enter correct arugment");
        }
        return cheak(m - 1, n - 1);
    }

    static int cheak(int i, int j) {
        if (i == 0 || 0 == j) {
            return 1;
        }
        return cheak(i, j - 1) + cheak(i - 1, j);
    }
}
