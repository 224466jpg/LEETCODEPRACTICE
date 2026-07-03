import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] ans = new int[intervals.length][2];

        int j = 0;

        ans[0] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            
            if (intervals[i][0] <= ans[j][1]) {

                ans[j][1] = Math.max(ans[j][1], intervals[i][1]);

            } else {

                j++;
                ans[j] = intervals[i];
            }
        }

        return Arrays.copyOf(ans, j + 1);
    }
}