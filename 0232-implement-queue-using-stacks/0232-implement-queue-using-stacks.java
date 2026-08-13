class MyQueue {
    Stack<Integer>stk;
    Stack<Integer>helperstk;

    public MyQueue() {
        stk = new Stack<>();
        helperstk = new Stack<>();
    }
    
    public void push(int x) {
        while(!stk.isEmpty()){
           helperstk.push(stk.pop());

        }
        stk.push(x);
        while(!helperstk.isEmpty()){
          stk.push(helperstk.pop());
        }
        
    }
    
    public int pop() {
        
        return stk.pop();
    }
    
    public int peek() {
        return stk.peek();
        
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */