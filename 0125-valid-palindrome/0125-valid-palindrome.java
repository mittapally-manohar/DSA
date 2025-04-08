class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0, j=ch.length-1; i < j; ) {
            if (!Character.isLetterOrDigit(ch[i])){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(ch[j])){
                j--;
                continue;
            }
            if (Character.toLowerCase(ch[i])==Character.toLowerCase(ch[j])){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}