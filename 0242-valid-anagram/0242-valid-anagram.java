class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
            return false;
        }

        // Array to count character frequencies
        int[] count = new int[26];

        // Increment for `s` and decrement for `t`
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}