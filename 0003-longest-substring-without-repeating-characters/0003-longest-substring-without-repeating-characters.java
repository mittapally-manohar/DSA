class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> seen = new HashMap<>();
        int start = 0, end = 0, max=0;
        while (end < s.length()) {
            char ch = s.charAt(end);
            if (seen.containsKey(ch)){
                if (seen.get(ch) >= start) {
                    start = seen.get(ch)+1;
                }
            }
            max = Math.max(max, end-start+1);
            seen.put(ch,end);
            end++;
        }
        return max;
    }
}