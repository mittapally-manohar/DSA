class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s.toCharArray(),0,res);
        return res;
    }

    public void backtrack(char[] chars, int index, List<String> res){
        if (index == chars.length) {
            res.add(new String(chars));
            return;
        }
        if (Character.isDigit(chars[index])){
            backtrack(chars, index+1, res);
        } else {
            chars[index] = Character.toLowerCase(chars[index]);
            backtrack(chars, index+1, res);

            chars[index] = Character.toUpperCase(chars[index]);
            backtrack(chars, index+1, res);
        }
    }
}