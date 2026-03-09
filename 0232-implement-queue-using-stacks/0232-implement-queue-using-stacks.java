class MyQueue {
    Queue<Integer> queue;
    public MyQueue() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        if(!empty()){
       int rem = queue.remove();
       return rem;
        }
        return -1;
    }
    
    public int peek() {
        if(!empty()){
        int top = queue.peek();
        return top;
        }
        return -1;
    }
    
    public boolean empty() {
        if (queue.isEmpty())
        return true;
        else
        return false;
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