class Solution {
    public static void swap( int nums[], int i ,int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums [j] = temp;

    }
    public void sortColors(int[] nums) {
        int n = nums .length;
        for(int i =0; i<n; i++){
            int minIdx = i;
            for(int j = i+1; j<n; j++){
                if(nums[j]<nums[minIdx]){
                    minIdx = j;

                }

            }
            swap( nums , i , minIdx);
        }
        return ;
    }
}