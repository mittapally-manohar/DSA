class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0, j = 0;
        while (i < v1.length && j < v2.length) {
            int l = Integer.parseInt(v1[i]);
            int r = Integer.parseInt(v2[i]);
            System.out.println(l+" "+r);
            if (l == r) {
                i++;
                j++;
            } else if (l > r) {
                return 1;
            } else {
                return -1;
            }
        }
        while (j < v2.length) {
            int num = Integer.parseInt(v2[j]);
            if (num == 0) {
                j++;
            }else{
                return -1;
            }
        }
         while (i < v1.length) {
            int num = Integer.parseInt(v1[i]);
            if (num == 0) {
                i++;
            }else{
                return 1;
            }
        }
        return 0;
    }
}