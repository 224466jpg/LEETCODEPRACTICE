class Solution {
    public int distinctSubseqII(String s) {

        long dp = 1; // empty subsequence

        long[] last = new long[26];

        for (char c : s.toCharArray()) {

            int index = c - 'a';

            long newDp = (2 * dp - last[index]) % 1000000007;

            if (newDp < 0) {
                newDp += 1000000007;
            }

            last[index] = dp;
            dp = newDp;
        }

        // Remove empty subsequence
        return (int)((dp - 1 + 1000000007) % 1000000007);
    }
}