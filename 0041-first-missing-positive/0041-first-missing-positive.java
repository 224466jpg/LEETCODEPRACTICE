class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // Replace non-positive numbers
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }

        // Mark existing numbers
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);

            if (val <= n) {
                int index = val - 1;
                nums[index] = -Math.abs(nums[index]);
            }
        }

        // Find first positive index
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }
}