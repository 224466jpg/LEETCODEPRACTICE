class Solution {
    public int[] singleNumber(int[] nums) {
        int xorr = 0;
        for(int el : nums){
            xorr = xorr ^ el ;

        }
        int temp = xorr;
        int k =0;
        int mask = (xorr & (xorr - 1) ^ xorr);
        int cat_A = 0;
        int cat_B = 0;
        for(int el: nums){
            if((el & mask)!=0){
                cat_A = cat_A ^ el;
            }
            else{
                cat_B = cat_B ^ el ; 
            }
        }
         return new int[]{cat_A,cat_B};
    }
}