class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for (Map.Entry<Character, Integer> m :map.entrySet()) {
            if (m.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}