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
            if (Math.abs(nums[i]) <= n) {
                nums[Math.abs(nums[i]) - 1] =
                    -Math.abs(nums[Math.abs(nums[i]) - 1]);
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