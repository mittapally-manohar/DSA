class Solution {
    public int maxArea(int[] a) {
       int low = 0, high = a.length - 1;
       int areaMax = (high - low) * Math.min(a[low], a[high]);
       while (low < high) {
            if (a[low] < a[high]) {
                low ++;
            } else {
                high --;
            }
            areaMax = Math.max(areaMax, (high - low) * Math.min(a[low], a[high]));
       }
       return areaMax;
    }
}