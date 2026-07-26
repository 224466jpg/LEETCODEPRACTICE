class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer> preffixsumidx = new HashMap<>();
       int preffixsum = -1;
       preffixsumidx.put(preffixsum , -1);
       int largestlen= 0 ;
       for(int i =0 ; i< nums.length ; i++){
        preffixsum += nums[i]==0 ? -1:+1;
        if(preffixsumidx.containsKey(preffixsum)){
            int currlen = i - preffixsumidx.get(preffixsum );
            if (currlen > largestlen){
               largestlen = currlen;}
            }
            else{
                preffixsumidx.put(preffixsum , i );
            }
        


       }
       return largestlen;
       
    }
}