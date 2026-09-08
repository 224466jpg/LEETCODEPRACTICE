class Solution {
    public int countCommas(int n) {
        int total = 0;
        for(int i =1000;i<=n;i++){
            total += (String.valueOf(i).length()-1) / 3 ;

        }return total;
    }
}