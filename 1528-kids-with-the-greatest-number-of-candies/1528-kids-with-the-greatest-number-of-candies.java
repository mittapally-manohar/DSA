class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int maxCandies = 0;
        for(int candy : candies) {
          maxCandies = Math.max(maxCandies, candy);
        }
        for(int candy : candies) {
            res.add(candy + extraCandies >= maxCandies);
        }
        return res;
    }
}