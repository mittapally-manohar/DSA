class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
       for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (!stack.isEmpty()) {
            char l = stack.peek();
            if (isPair(l,c)){
                stack.pop();
                continue;
            }
        }
        stack.push(c);
       }
       return stack.isEmpty();
    }
    public boolean isPair(char l, char c) {
        return (l == '(' && c ==')') ||
            (l == '{' && c =='}') ||
            (l =='[' && c ==']');
    }
}