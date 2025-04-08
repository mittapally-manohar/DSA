class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0, j=ch.length-1; i < j; i++,j--) {
            while (i<j && !Character.isLetterOrDigit(ch[i])){
                i++;
            }
            while (i< j&&!Character.isLetterOrDigit(ch[j])){
                j--;
            }
            if (Character.toLowerCase(ch[i])!=Character.toLowerCase(ch[j])){
               return false;
            }
        }
        return true;
    }
}