class Solution {
    void swap(int[]nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        int j =0;
        while(i<n){
            if(nums[i]==0){
                i++;
            }
            else{
                swap(nums , i++, j++);
            }
        }

    }
}
