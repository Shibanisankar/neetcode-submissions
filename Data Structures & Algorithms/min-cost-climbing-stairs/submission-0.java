class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int one = cost[cost.length - 1];
        int two = cost[cost.length - 2];

        for(int i = cost.length - 3 ; i >= 0 ; i = i - 2) {
                one = cost[i] + (one > two ? two : one);
                if(i - 1 >= 0)
                    two = cost[i-1] + (two > one ? one : two);
        }

        return one > two ? two : one;
    }
}
