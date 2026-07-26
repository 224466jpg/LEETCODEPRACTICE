class Solution {
    public int[] productExceptSelf(int[] nums) {
        //step 1 : store the left products 
        int n = nums.length;
        int[]ans = new int[n];
        ans[0] = 1;
        //store the left part of the array
        for(int i = 1; i<n ; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        //now for the right part 
        int rytproduct = 1;
        for(int i=n-1 ; i>=0; i--){
            ans[i] *= rytproduct;
            rytproduct *= nums[i];
            


        }
        return ans;


    }
}