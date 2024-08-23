import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q = new LinkedList<>();
    
    public MyStack() {
        // Constructor
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        return q.remove(); // Get and remove the last added element
    }
    
    public int top() {
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        int val = q.remove(); // Get the last added element
        q.add(val); // Add it back to the queue
        return val;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}