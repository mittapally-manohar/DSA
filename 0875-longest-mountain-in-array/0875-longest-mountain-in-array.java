class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;
        int mountain = 0;
        for (int i = 1; i < n - 1; i++) {
            int up = 0, down = 0;
            for (int j = i-1; j >= 0 && arr[j+1] > arr[j]; j--)
            {
                up++;
            }
            for (int j = i+1; j <= n-1 && arr[j-1] > arr[j]; j++)
            {
                 down++;
            }
            if (up > 0 && down > 0) {
                mountain = Math.max(mountain, up+down+1);
            }
        }
        return mountain;
    }
}