class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }

        int l = 0, r = n - 1;

        if(nums[0] < nums[n-1]){
            return nums[0];
        }

        while(l <= r){
            int mid = (l + r) / 2;

            if(nums[mid] > nums[mid+1]){
                // mid -> peak
                // mid+1 -> min
                return nums[mid+1];
            }

            if(nums[mid] < nums[mid-1]){
                // mid-1 -> peak
                // mid -> min
                return nums[mid];
            }

            // check mid lies on which partition?
            if(nums[0] < nums[mid]){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        return -1;
    }
}