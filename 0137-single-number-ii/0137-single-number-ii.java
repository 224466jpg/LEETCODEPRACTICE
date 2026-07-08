class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        // Check every bit position (0 to 31)
        for (int k = 0; k < 32; k++) {
            int mask = 1 << k;
            int count = 0;

            // Count how many numbers have the kth bit set
            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] & mask) != 0) {
                    count++;
                }
            }

            // If the count is not divisible by 3,
            // the unique number has this bit set
            if (count % 3 != 0) {
                ans |= mask;
            }
        }

        return ans;
    }
}