class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n-k+1];
        Deque <Integer> deq  = new ArrayDeque<>();
        int i ;
        for(i=0;i<k;i++){
            //add the elements to the end
            while(!deq.isEmpty() && arr[deq.peekLast()]<= arr[i]){
                deq.removeLast();
            }
            deq.addLast(i);
        }
        int ptr = 0;


        for(i = k ;i<n;i++){
            ans[ptr++] = arr[deq.peekFirst()];
            while(!deq.isEmpty() && deq.peekFirst()<= i-k){
                deq.removeFirst();
            }
           while(!deq.isEmpty() && arr[deq.peekLast()]<=arr[i]){
                deq.removeLast();
            }
            deq.addLast(i);
        } 
        ans[ptr++] = arr[deq.peekFirst()];
        return ans;
  

    }
}