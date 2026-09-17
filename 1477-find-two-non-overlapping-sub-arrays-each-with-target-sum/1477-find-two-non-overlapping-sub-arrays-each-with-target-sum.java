class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = 1_000_000;
        
        // best[i] = minimum length of a valid subarray
        // completely inside indices [0...i]
        int[] best = new int[n];
        java.util.Arrays.fill(best, INF);

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        map.put(0, -1);

        int prefix = 0;
        int ans = INF;
        int minLen = INF;

        for (int i = 0; i < n; i++) {
            prefix += arr[i];

            // If prefix - target exists, subarray (j+1 ... i)
            // has sum = target
            if (map.containsKey(prefix - target)) {
                int j = map.get(prefix - target);
                int len = i - j;

                // Combine with a previous non-overlapping subarray
                if (j >= 0 && best[j] != INF) {
                    ans = Math.min(ans, len + best[j]);
                } else if (j == -1) {
                    // No previous subarray
                }

                minLen = Math.min(minLen, len);
            }

            best[i] = minLen;

            map.put(prefix, i);
        }

        return ans == INF ? -1 : ans;
    }
}