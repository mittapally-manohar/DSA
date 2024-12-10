						 
					 

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        int minLen = Integer.MAX_VALUE;
        int minStart = 0, start = 0;
        int required = t.length();

        for ( int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            if (map.containsKey(endChar)){
                if (map.get(endChar) > 0) {
                    required --;
                }
                map.put(endChar, map.get(endChar) - 1);
            }
            while (required == 0) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }
                char startChar = s.charAt(start);
                if (map.containsKey(startChar)) {
                    if (map.get(startChar) >= 0) {
                        required ++;
                    }
                    map.put(startChar, map.get(startChar) + 1);
                }
                start ++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "":s.substring(minStart, minStart+minLen);
    }
}
