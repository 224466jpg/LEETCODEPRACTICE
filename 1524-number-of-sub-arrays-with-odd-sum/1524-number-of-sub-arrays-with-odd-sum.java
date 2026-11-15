class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd = 0;
        int even = 1;
        int ans = 0 ;
        int sum = 0;
        for(int num : arr){
            sum += num ; 
            if(sum % 2 == 0){
                ans += odd ; 
                even++;

            }
            else{
                ans += even ;
                odd++;
            }
            ans %= 1000000007;
        }
        return ans ;
    }
}