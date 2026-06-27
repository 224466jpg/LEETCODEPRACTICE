class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar = nums[0];
        int maxendinghere = nums[0];
        for(int i=1; i<nums.length; i++){
            maxendinghere = Math.max(maxendinghere+nums[i],nums[i]);
            maxsofar = Math.max(maxsofar , maxendinghere);


        }return maxsofar;
        

}}