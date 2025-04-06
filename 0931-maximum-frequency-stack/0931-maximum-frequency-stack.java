class FreqStack {
    
    private HashMap<Integer,Integer> freq;
    private HashMap<Integer, Stack<Integer>> grpMap; 
    int maxFreq = Integer.MIN_VALUE;
    public FreqStack() {
        freq = new HashMap<>();
        grpMap = new HashMap<>();
    }
    
    public void push(int val) {
        int freqEle = freq.getOrDefault(val, 0)+1;
        freq.put(val, freqEle);
        if(!grpMap.containsKey(freqEle)){
            grpMap.put(freqEle, new Stack<>());
        }
        grpMap.get(freqEle).push(val);
        maxFreq = Math.max(maxFreq, freqEle);
    }
    
    public int pop() {
        Stack<Integer> s = grpMap.get(maxFreq);
        int x = s.pop();
        freq.put(x, freq.get(x)-1);
        if(s.isEmpty()){
            grpMap.remove(maxFreq);
            maxFreq--;
        }
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */