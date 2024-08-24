class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st1 = new Stack<>();
    
    public MyQueue() {
    }
    
    public void push(int x) {
        while (!st1.isEmpty()) {
            st.push(st1.pop());
        }
        st.push(x);
        while (!st.isEmpty()) {
            st1.push(st.pop());
        }
    }
    
    public int pop() {
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}
