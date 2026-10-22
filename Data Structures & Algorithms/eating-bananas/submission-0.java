class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = 1;
        
        while(l <= r){
            int m = (l + r)/2;
            long totalHour = 0;
            for(int p : piles){
                totalHour += Math.ceil((double) p/m);
            }
            if(totalHour <= h) {
                res = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }
}
