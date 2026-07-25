class Solution {
    public int countDigits(int num) {
        int n = num;
        int i = 0 ;
        while(n > 0){
            int val = n % 10 ;
            if(val != 0 && n%val == 0){
                i++;
            }
            n /= 10;



        }
        return i ;
    }
}