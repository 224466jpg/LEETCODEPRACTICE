class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int ans = n ;
       for(int i =0; i<n ; i++){
        ans ^= i;
        //we will get the digit
        ans ^= nums[i];

       }
       return ans;//get the missing nuymber after that

    }
}