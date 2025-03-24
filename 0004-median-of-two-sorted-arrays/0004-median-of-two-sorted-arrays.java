class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n = nums1.length + nums2.length;
        int[] res = new int[n];
        int r = nums2.length-1;
        int l = nums1.length-1;
        int k = n-1;
        while (r >= 0 && l >= 0) {
            if (nums1[l] > nums2[r]) {
                res[k--] = nums1[l--];
            } else {
                res[k--] = nums2[r--];
            }
        }
        while (r >= 0) {
            res[k--] = nums2[r--];
        }
        while (l >= 0) {
            res[k--] = nums1[l--];
        }

        if (n % 2 == 0) {
            int sum = res[(n+1)/2] + res[(n-1)/2];
            return (double) sum/2;
        } else {
            return (double) res[n/2];
        } 
    }  
}