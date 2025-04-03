class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> current=null;

      for (int i = 0; i < numRows; i++) {
        current = new ArrayList<>();
        for (int j = 0; j <= i; j++) {
            if (j==0 || j==i) {
                current.add(1);
            } else {
                current.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
        }
        res.add(current);
      }
      return res;
    }
}