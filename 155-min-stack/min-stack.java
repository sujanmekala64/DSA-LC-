class MinStack {
    Stack<Integer> s;
    Stack<Integer> a;
    public MinStack() {
        s = new Stack<>();
        a = new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(val);
            a.push(val);
        }
        else{
            s.push(val);
            if(a.peek()>=val){
                a.push(val);
            }
        }
    }
    
    public void pop() {
        int popped = s.pop();
        if(popped==a.peek()) a.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return a.peek();
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