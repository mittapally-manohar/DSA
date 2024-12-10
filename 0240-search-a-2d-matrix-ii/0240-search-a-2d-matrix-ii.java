class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, column = matrix[0].length;
        int i = 0, j = column - 1;
        while (i < row && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}