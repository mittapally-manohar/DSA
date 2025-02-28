class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++) {
            min = Math.min(min, Math.abs(arr[i]- arr[i-1]));
        }
        System.out.println(min);
        for(int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]-arr[i-1])==min){
                res.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return res;
    }
}