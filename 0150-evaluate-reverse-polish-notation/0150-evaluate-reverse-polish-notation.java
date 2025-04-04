class Solution {
    private static final Set<String> OPERATORS = Set.of("+", "-", "*", "/");

    private boolean isOperator(String s) {
        return OPERATORS.contains(s);
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (!isOperator(s)) {
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