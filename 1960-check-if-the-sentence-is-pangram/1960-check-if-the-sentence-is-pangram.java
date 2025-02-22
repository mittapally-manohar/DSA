class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<String> chars = new HashSet<>();
        for(String ch : sentence.split("")){
            chars.add(ch);
        }
        return chars.size() == 26;
    }
}