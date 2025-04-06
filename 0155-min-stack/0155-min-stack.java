class MinStack {

    Stack<Integer> stack = new Stack<>();
    List<Integer> list = new ArrayList<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        list.add(val);
        Collections.sort(list);
    }
    
    public void pop() {
        list.remove(stack.pop());
        Collections.sort(list);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return list.get(0);
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