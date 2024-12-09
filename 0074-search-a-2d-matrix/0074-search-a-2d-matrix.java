class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, column = matrix[0].length;
        int low = 0, high = row * column - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midEle = matrix[mid / column][mid % column];
            if (midEle == target) {
                return true;
            } else if (midEle > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}