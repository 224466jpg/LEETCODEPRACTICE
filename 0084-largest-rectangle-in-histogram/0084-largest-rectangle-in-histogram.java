class Solution {
    private int[] nseleft(int[]arr){
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        int[] nseleft = new int[n];
        for(int i =  arr.length - 1; i>=0; i--){
            while(!stk.isEmpty() && arr[i]<arr[stk.peek()]){
                nseleft[stk.peek()] = i;
                stk.pop();

            }
            stk.push(i);

        }
        while(!stk.isEmpty()){
            nseleft[stk.peek()] = -1;
            stk.pop();
        }
        return nseleft;
    }
    private int[] nseright(int[]arr){
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        int[] nseright = new int[n];
        for(int i = 0 ; i< n ; i++){
            while(!stk.isEmpty() && arr[i]< arr[stk.peek()]){
                nseright[stk.peek()] = i ;
                stk.pop();
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            nseright[stk.peek()]= n;
            stk.pop();
        }
        return nseright;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nright = nseright(heights);
        int[] nleft = nseleft(heights);
        int maxarea = 0 ;


         
        for(int  i = 0 ; i<n ; i++){
            int width = nright[i] -  nleft[i] - 1 ;
            maxarea = Math.max(maxarea , heights[i]* width);



        }
        return maxarea ; 

        
    }
}