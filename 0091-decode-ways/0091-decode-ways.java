class Solution {
    public int numDecodings(String s) {
       if (s == null || s.length() == 0 || s.charAt(0) == '0') {
        return 0;
       }
       int[] memo = new int[s.length()];
       Arrays.fill(memo, -1);
       return decode(s, 0, memo);
    //    int oldState = 1, newState = 1;
    //    for (int i = 1; i < s.length(); i++ ) {
    //     int count = 0;
    //     if (s.charAt(i) != '0') {
    //         count = newState;
    //     }
    //     int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));
    //     if (twoDigit >= 10 && twoDigit <= 26) {
    //         count += oldState;
    //     }
    //     oldState = newState;
    //     newState = count;
    //    }
    //    return newState;
    }

    public int decode(String s, int i, int[] memo) {
        if (i == s.length()) {
            return 1;
        }
        if (s.charAt(i) == '0'){
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        int result = decode(s, i+1, memo);
        if (i+2 <= s.length()) {
            int twoDigit = Integer.parseInt(s.substring(i, i+2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                result += decode(s, i+2, memo);
            }
        }
        memo[i] = result;
        return result;
    }
}