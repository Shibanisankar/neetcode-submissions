class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        
        int top = 0, bot = ROW - 1;
        while(top <= bot){
            int mid = (top + bot) / 2;
            if(target > matrix[mid][COL - 1]) {
                top = mid + 1;
            } else if (target < matrix[mid][0]) {
                bot = mid - 1;
            } else {
                break;
            }
        }
        if(top > bot) return false;
        int row = (top + bot) / 2;
        int l = 0, r = COL - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (target > matrix[row][m]) {
                l = m + 1;
            } else if (target < matrix[row][m]) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
    
}
