class Solution {
    public double myPow(double x, int n) {
        long N  = n ;
       double ans = 1.0 ;
       if ( n < 0){
        N = -1 * (long )n  ;
        x = 1.0 / x ;
       }
       while(N > 0){
        if (N % 2 == 0){
            x = x * x ;
            N = N / 2 ; 
        }
        else{
            ans = x * ans ;
            N -- ; 
        
        }
       }
       
       return ans ;
       
    }
}