
class Solution {
    int m, n;
    Boolean[][][] dp;

    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        if ((m + n) % 2 == 0) return false;

        dp = new Boolean[m][n][m + n + 1];

        return dfs(grid, 0, 0, 0);
    }

    private boolean dfs(char[][] grid, int i, int j, int balance) {

        if (i >= m || j >= n) return false;

        if (grid[i][j] == '(') {
            balance++;
        } else {
            balance--;
        }

        // Invalid balance
        if (balance < 0) return false;

        // Remaining cells cannot balance the parentheses
        int remaining = (m - 1 - i) + (n - 1 - j);

        if (balance > remaining) return false;

        // Destination reached
        if (i == m - 1 && j == n - 1) {
            return balance == 0;
        }

        if (dp[i][j][balance] != null) {
            return dp[i][j][balance];
        }

        boolean right = dfs(grid, i, j + 1, balance);
        boolean down = dfs(grid, i + 1, j, balance);

        return dp[i][j][balance] = right || down;
    }
}