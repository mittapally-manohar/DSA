class Solution {
    private static final Set<String> OPERATORS = Set.of("+", "-", "*", "/");

    public boolean isOperator(String s) {
        return OPERATORS.contains(s);
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int right = stack.pop();
                int left = stack.pop();
                switch (token) {
                    case "+" -> stack.push(left + right);
                    case "-" -> stack.push(left - right);
                    case "*" -> stack.push(left * right);
                    case "/" -> stack.push(left / right);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}