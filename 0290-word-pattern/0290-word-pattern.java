class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length){
            return false;
        }
        Map<Character,String> charToWord = new HashMap<>();
        Map<String,Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (charToWord.containsKey(ch) && !charToWord.get(ch).equals(word)) {
                return false;
            }else {
                charToWord.put(ch, word);
            }
            if (wordToChar.containsKey(word) && !wordToChar.get(word).equals(ch)){
                 return false;
            }else{
                wordToChar.put(word,ch);
            }  
        }
        return true;
    }
}