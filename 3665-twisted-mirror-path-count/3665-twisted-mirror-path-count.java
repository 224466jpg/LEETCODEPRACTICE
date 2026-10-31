class Solution {
    private int m, n;
    private int[][] grid;
    private int[][] rightMemo, downMemo;

    private static final int INVALID = -1;

    // Encodes a cell as row * n + col.
    // -1 means the move is invalid.
    private int resolve(int r, int c, int dir) {
        if (r >= m || c >= n) {
            return INVALID;
        }

        int[][] memo = (dir == 0) ? rightMemo : downMemo;

        if (memo[r][c] != -2) {
            return memo[r][c];
        }

        if (grid[r][c] == 0) {
            return memo[r][c] = r * n + c;
        }

        int result;

        if (dir == 0) {
            // Entered mirror while moving right:
            // reflect down to the cell below the mirror.
            result = resolve(r + 1, c, 1);
        } else {
            // Entered mirror while moving down:
            // reflect right to the cell right of the mirror.
            result = resolve(r, c + 1, 0);
        }

        return memo[r][c] = result;
    }

    public int uniquePaths(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        rightMemo = new int[m][n];
        downMemo = new int[m][n];

        for (int i = 0; i < m; i++) {
            java.util.Arrays.fill(rightMemo[i], -2);
            java.util.Arrays.fill(downMemo[i], -2);
        }

        final int MOD = 1_000_000_007;
        long[][] dp = new long[m][n];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) {
                    continue;
                }

                // Attempt to move right.
                int dest = resolve(i, j + 1, 0);
                if (dest != INVALID) {
                    int r = dest / n;
                    int c = dest % n;
                    dp[r][c] = (dp[r][c] + dp[i][j]) % MOD;
                }

                // Attempt to move down.
                dest = resolve(i + 1, j, 1);
                if (dest != INVALID) {
                    int r = dest / n;
                    int c = dest % n;
                    dp[r][c] = (dp[r][c] + dp[i][j]) % MOD;
                }
            }
        }

        return (int) dp[m - 1][n - 1];
    }
}