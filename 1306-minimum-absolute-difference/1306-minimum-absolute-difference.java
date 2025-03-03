class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE; 
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++) {
           int minDiff = arr[i] - arr[i-1];
           if (minDiff < min) {
            min = minDiff;
            res.clear();
             res.add(Arrays.asList(arr[i-1],arr[i]));
           }
           else if (minDiff == min) {
            res.add(Arrays.asList(arr[i-1],arr[i]));
           }
        }
        return res;
    }
}