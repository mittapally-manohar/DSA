class Solution {
    Map<Character,Character> map = Map.of(
        '(',')','[',']','{','}'
    );
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(map.get(ch));
            }
            else if (stack.isEmpty() || stack.pop()!=ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}