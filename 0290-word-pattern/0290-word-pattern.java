class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length){
            return false;
        }
        Map<Object,Object> map = new HashMap<>();
        for (Integer i = 0; i < words.length; i++) {
            System.out.println(map);
            if (map.put(pattern.charAt(i),i) != map.put(words[i],i)){
                return false;
            }
        }
         System.out.println(map);
        return true;
    }
}