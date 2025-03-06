class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> disappearedNumbers = new ArrayList<>();
      Set<Integer> uniqueNumbers = new HashSet<>();
      for (int num : nums) {
        uniqueNumbers.add(num);
      }
      for (int i = 1 ; i <= nums.length; i++) {
        if(!uniqueNumbers.contains(i)){
            disappearedNumbers.add(i);
        }
      }
      return disappearedNumbers;
    }
}