class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] chars = new int[26];
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            chars[c-'a']++;
        }
        for(int i = 0; i< 26; i++) {
            if(chars[i]==0){
                return false;
            }
        }
        return true;
    }
}