public class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int []> stack = new Stack<>();

        for(int i = 0 ; i < heights.length ; i++){
            int start = i;
            while(!stack.isEmpty() && heights[i] < stack.peek()[1]){
                int[] top = stack.pop();
                maxArea = Math.max(maxArea, top[1] * (i - top[0]));
                start = top[0];
            }
            stack.push(new int[]{start,heights[i]});
        }

        while(!stack.isEmpty()){
            int[] top = stack.pop();
            maxArea = Math.max(maxArea,(heights.length - top[0]) * top[1]);
        }
        return maxArea;
    }
}