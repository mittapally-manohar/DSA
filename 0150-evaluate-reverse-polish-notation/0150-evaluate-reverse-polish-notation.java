class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (!s.matches("^[+\\*-/]$")){
                stack.push(Integer.parseInt(s));
            }else {
                int r = stack.pop();
                int l = stack.pop();
                switch(s) {
                    case "+" -> stack.push(l+r);
                    case "-" -> stack.push(l-r);
                    case "*" -> stack.push(l*r);
                    case "/" -> stack.push((int)l/r);
                }
            }
        }
        return stack.pop();
    }
}