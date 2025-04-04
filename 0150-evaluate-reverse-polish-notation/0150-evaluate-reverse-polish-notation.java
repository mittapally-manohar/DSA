class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (!s.matches("^[+\\*-/]$")) {
                stack.push(Integer.parseInt(s));
            } else {
                int r = stack.pop();
                int l = stack.pop();
                if (s.equals("+")) {
                    stack.push(l + r);
                } else if (s.equals("-")) {
                    stack.push(l - r);
                } else if (s.equals("*")) {
                    stack.push(l * r);
                } else if (s.equals("/")) {
                    stack.push(l / r);
                }

            }
        }
        return stack.pop();
    }
}