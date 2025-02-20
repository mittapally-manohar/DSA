class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        for(int candy : candies) {
            candy = candy + extraCandies;
            int count = 0;
            for(int i = 0; i < candies.length; i++) {
                if(candy>=candies[i]) count++;
                else break;
            }
            if(count == candies.length){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}