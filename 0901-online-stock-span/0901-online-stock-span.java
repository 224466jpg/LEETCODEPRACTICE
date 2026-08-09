class StockSpanner {
    int dayidx;
    Stack<Pair> stk;
    class Pair {
        int dayidx;
        int price;

        Pair(int dayidx, int price) {
            this.dayidx = dayidx;
            this.price = price;
        }
    }

    public StockSpanner() {
        dayidx = 0 ;
        stk = new Stack<>();  
    }
    
    public int next(int price) {
        while(!stk.isEmpty()&& price >= stk.peek().price){
            stk.pop();
        }
        int span;
        if(stk.isEmpty()){
            span = dayidx + 1 ;


        }
        else{
            span = dayidx - stk.peek().dayidx;

        }
        Pair pair = new Pair(dayidx , price);
        stk.push(pair);
        dayidx++ ;


        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */