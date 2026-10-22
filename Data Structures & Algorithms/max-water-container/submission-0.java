class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int i = 0;
        int j = heights.length - 1;
        while (i < j) {
            int height = heights[i] < heights[j] ? heights[i] : heights[j];
            res = Math.max(height * (j - i), res);
            if(heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}
