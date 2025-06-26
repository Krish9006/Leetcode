class MinStack {
Stack<Integer> st1;
Stack<Integer> st2;
    public MinStack() {
       st1 = new Stack<>();
       st2 = new Stack<>();
    }
    
    public void push(int val) {
        if(st1.size()==0){
            st1.push(val);
            st2.push(val);
        }
        else{
            st1.push(val);
            st2.push(Math.min(val,st2.peek()));
        }
    }
    
    public void pop() {
        if(st1.size()==0)return;
        st1.pop();
        st2.pop();
    }
    
    public int top() {
       if(st1.size()==0){
        return -1;
       }
         return st1.peek();
       
    }
    
    public int getMin() {
         if(st1.size()==0){
            return -1;
        }
        return st2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */