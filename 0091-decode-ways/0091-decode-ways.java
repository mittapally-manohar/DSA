class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0 || s == null || s.charAt(0) == '0') {
            return 0;
        }
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return decode(0, s, memo);
    }

    public int decode(int i, String s, int[] memo) {
        if (i == s.length()) {
            return 1;
        }
        if (s.charAt(i) == '0') {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        int ways = decode(i + 1, s, memo);

        if (i < s.length()-1) {
            int twoDigit = Integer.parseInt(s.substring(i, i+2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                ways += decode(i+2, s, memo);
            }
        }
        memo[i] = ways;
        return ways;
    }
}